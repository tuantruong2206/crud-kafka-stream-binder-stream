package com.example.stream.config;

import com.example.stream.streams.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
