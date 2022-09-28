package com.example.testing.spring_potrishitel.impl;

import com.example.testing.spring_potrishitel.annotation.DeprecatedClass;
import com.example.testing.spring_potrishitel.annotation.InjectRandomInt;
import com.example.testing.spring_potrishitel.annotation.PostProxy;
import com.example.testing.spring_potrishitel.annotation.Profiling;
import com.example.testing.spring_potrishitel.interfaces.Quoter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Profiling
//@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message = "I'll be back";

    @PostConstruct
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

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
//    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);

        }
    }
}
