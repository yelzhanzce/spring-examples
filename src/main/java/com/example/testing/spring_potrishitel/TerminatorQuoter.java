package com.example.testing.spring_potrishitel;

import org.springframework.stereotype.Component;

//@Component
//@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println(repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("starting say quote");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);

        }
    }
}
