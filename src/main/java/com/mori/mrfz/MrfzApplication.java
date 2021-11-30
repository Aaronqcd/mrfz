package com.mori.mrfz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com")
public class MrfzApplication {

    public static void main(String[] args) {
        SpringApplication.run(MrfzApplication.class, args);
    }

}
