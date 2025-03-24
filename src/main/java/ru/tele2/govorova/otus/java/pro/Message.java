package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    @JsonProperty("ROWID")
    private long rowId;

    @JsonProperty("attributedBody")
    private String attributedBody;

    @JsonProperty("belong_number")
    private String belongNumber;

    @JsonProperty("date")
    private long date;

    @JsonProperty("date_read")
    private long dateRead;

    @JsonProperty("guid")
    private String guid;

    @JsonProperty("handle_id")
    private int handleId;

    @JsonProperty("has_dd_results")
    private int hasDdResults;

    @JsonProperty("is_deleted")
    private int isDeleted;

    @JsonProperty("is_from_me")
    private int isFromMe;

    @JsonProperty("send_date")
    private String sendDate;

    @JsonProperty("send_status")
    private int sendStatus;

    @JsonProperty("service")
    private String service;

    @JsonProperty("text")
    private String text;

}