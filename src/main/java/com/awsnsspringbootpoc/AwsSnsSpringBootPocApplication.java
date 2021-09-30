package com.awsnsspringbootpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AwsSnsSpringBootPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsSnsSpringBootPocApplication.class, args);
    }

}
