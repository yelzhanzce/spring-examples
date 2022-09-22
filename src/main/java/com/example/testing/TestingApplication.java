package com.example.testing;

import com.example.testing.spring_potrishitel.Quoter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class TestingApplication {

    private final Quoter quoter;

    public static void main(String[] args) {
        SpringApplication.run(TestingApplication.class, args);
    }

    @PostConstruct
    void test(){
        quoter.sayQuote();
    }

}
