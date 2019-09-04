package com.edu.nchu.offer100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Offer100Application {

    public static void main(String[] args) {
        SpringApplication.run(Offer100Application.class, args);
    }

}
