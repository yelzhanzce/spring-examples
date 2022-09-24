package com.example.testing;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TestingApplication {

//    private final Quoter quoter;

    public static void main(String[] args) {
        SpringApplication.run(TestingApplication.class, args);
    }

//    @PostConstruct
//    void test(){
//        quoter.sayQuote();
//    }

}
