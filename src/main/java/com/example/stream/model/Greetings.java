package com.example.stream.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}
