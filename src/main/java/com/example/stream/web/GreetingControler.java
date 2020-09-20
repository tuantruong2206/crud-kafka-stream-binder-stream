package com.example.stream.web;

import com.example.stream.model.Greetings;
import com.example.stream.service.GreetingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControler {

    private final Logger log = LoggerFactory.getLogger(GreetingControler.class);
    private final GreetingsService greetingsService;

    public GreetingControler(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greeting")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greeting(@RequestParam("message") String message) {
        Greetings greetings = Greetings.builder().message(message).timestamp(System.currentTimeMillis()).build();
        greetingsService.sendGreeting(greetings);
    }
}
