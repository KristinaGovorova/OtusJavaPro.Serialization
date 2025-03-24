package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class MessageInfo {
    private String chatIdentifier;
    private String memberLast;
    private String belongNumber;
    private String sendDate;
    private String text;

    @JsonCreator
    public MessageInfo(
            @JsonProperty("chatIdentifier") String chatIdentifier,
            @JsonProperty("memberLast") String memberLast,
            @JsonProperty("belongNumber") String belongNumber,
            @JsonProperty("sendDate") String sendDate,
            @JsonProperty("text") String text) {
        this.chatIdentifier = chatIdentifier;
        this.memberLast = memberLast;
        this.belongNumber = belongNumber;
        this.sendDate = sendDate;
        this.text = text;
    }

    public String getChatIdentifier() { return chatIdentifier; }
    public String getMemberLast() { return memberLast; }
    public String getBelongNumber() { return belongNumber; }
    public String getSendDate() { return sendDate; }
    public String getText() { return text; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageInfo that = (MessageInfo) o;
        return Objects.equals(chatIdentifier, that.chatIdentifier) &&
                Objects.equals(memberLast, that.memberLast) &&
                Objects.equals(belongNumber, that.belongNumber) &&
                Objects.equals(sendDate, that.sendDate) &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatIdentifier, memberLast, belongNumber, sendDate, text);
    }

    @Override
    public String toString() {
        return "ru.tele2.govorova.otus.java.pro.MessageInfo{" +
                "chatIdentifier='" + chatIdentifier + '\'' +
                ", memberLast='" + memberLast + '\'' +
                ", belongNumber='" + belongNumber + '\'' +
                ", sendDate='" + sendDate + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}