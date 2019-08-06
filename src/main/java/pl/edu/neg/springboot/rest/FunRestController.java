package pl.edu.neg.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello! Time: " + LocalDateTime.now();
    }

    @GetMapping("/a")
    public String getDailyWorkout() {
        return "Run fast!";
    }

    @GetMapping("/s")
    public String getFortune() {
        return "Lucky day!";
    }

/*
    @GetMapping("/d")
    public String getHello() {
        return "Hello my lucky day!";
    }*/

}
