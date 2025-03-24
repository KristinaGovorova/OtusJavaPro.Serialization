package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File inputFile = new File("src/main/resources/sms.json");

        SmsData smsData = objectMapper.readValue(inputFile, SmsData.class);

        Map<String, List<MessageInfo>> groupedMessages = smsData.getChatSessions().stream()
                .flatMap(chatSession -> chatSession.getMessages().stream()
                        .map(message -> new MessageInfo(
                                chatSession.getChatIdentifier(),
                                chatSession.getMembers().get(0).getLast(),
                                message.getBelongNumber(),
                                message.getSendDate(),
                                message.getText()
                        ))
                )
                .sorted(Comparator.comparing(MessageInfo::getSendDate)) // Сортировка по дате
                .collect(Collectors.groupingBy(MessageInfo::getBelongNumber)); // Группировка

        groupedMessages.forEach((key, value) -> {
            groupedMessages.put(key, value.stream().distinct().collect(Collectors.toList()));
        });

        File outputFile = new File("output.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, groupedMessages);

        Map<String, List<MessageInfo>> deserializedData = objectMapper.readValue(
                outputFile,
                new TypeReference<Map<String, List<MessageInfo>>>() {}
        );

        deserializedData.forEach((key, value) -> {
            System.out.println("Group: " + key);
            value.forEach(System.out::println);
        });
    }
}