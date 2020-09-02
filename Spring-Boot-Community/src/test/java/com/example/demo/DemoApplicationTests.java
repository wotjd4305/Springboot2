package com.example.demo;

import com.example.demo.domain.Board;
import com.example.demo.domain.User;
import com.example.demo.domain.enums.BoardType;
import com.example.demo.repository.BoardRepository;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
@SpringBootApplication
public class DemoApplicationTests implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
