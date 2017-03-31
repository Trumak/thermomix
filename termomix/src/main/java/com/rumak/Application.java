package com.rumak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tomasz on 26.03.17.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.rumak")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
