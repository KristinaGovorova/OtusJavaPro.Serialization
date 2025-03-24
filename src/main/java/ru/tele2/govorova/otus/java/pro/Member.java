package ru.tele2.govorova.otus.java.pro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    @JsonProperty("first")
    private String first;

    @JsonProperty("handle_id")
    private int handleId;

    @JsonProperty("image_path")
    private String imagePath;

    @JsonProperty("last")
    private String last;

    @JsonProperty("middle")
    private String middle;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("service")
    private String service;

    @JsonProperty("thumb_path")
    private String thumbPath;

}