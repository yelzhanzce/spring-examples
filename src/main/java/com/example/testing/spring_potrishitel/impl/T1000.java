package com.example.testing.spring_potrishitel.impl;

import com.example.testing.spring_potrishitel.interfaces.Quoter;
import org.springframework.stereotype.Component;

//@Component
public class T1000 extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Ya jidki!!!");;
    }
}
