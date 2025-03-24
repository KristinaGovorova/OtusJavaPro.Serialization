package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatSession {
    @JsonProperty("chat_id")
    private int chatId;

    @JsonProperty("chat_identifier")
    private String chatIdentifier;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("is_deleted")
    private int isDeleted;

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("messages")
    private List<Message> messages;

}