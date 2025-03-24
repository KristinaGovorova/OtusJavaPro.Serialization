package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SmsData {
    @JsonProperty("chat_sessions")
    private List<ChatSession> chatSessions;

    public List<ChatSession> getChatSessions() {
        return chatSessions;
    }

    public void setChatSessions(List<ChatSession> chatSessions) {
        this.chatSessions = chatSessions;
    }
}