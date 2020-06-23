package com.aroussi.demo;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


@Slf4j
@RestController
class HelloResource {

    @Autowired
    Environment env;

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        String greeting = String.format("Hello %s !", name);       
        return ResponseEntity.ok(greeting);
    }
    
    @GetMapping("/bye/{name}")
    public ResponseEntity<String> sayGoodbye(@PathVariable String name) {
        String greeting = String.format("Adieue %s !", name);       
        return ResponseEntity.ok(greeting);
    }
    
    @GetMapping("/awesome/{name}")
    public ResponseEntity<String> sayAwesome(@PathVariable String name) {
        String greeting = String.format("%s is Awesome.",name);       
        return ResponseEntity.ok(greeting);
    }

    
}

