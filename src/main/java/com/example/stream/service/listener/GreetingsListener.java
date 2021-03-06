package com.example.stream.service.listener;

import com.example.stream.model.Greetings;
import com.example.stream.streams.GreetingsStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class GreetingsListener {

    private Logger log = LoggerFactory.getLogger(GreetingsListener.class);

    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greeting: {}", greetings);
    }
}
