package com.ifood.ifoodclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@EnableMongoAuditing
@ComponentScan(basePackages = "com.ifood")
public class IfoodclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(IfoodclientApplication.class, args);
    }
}
