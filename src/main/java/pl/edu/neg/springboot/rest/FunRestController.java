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

}
