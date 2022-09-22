package com.example.testing.nestedclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
//@AllArgsConstructor
public class OutClass {
    private final List<Integer> districts = new ArrayList<>();

    public OutClass(){
        System.out.println("out class object");
    }

    @Getter
    public static class NestedClass {
        private final String name;

        private final List<String> data = new ArrayList<>();

        public NestedClass(String name) {
            this.name = name;
        }
    }
}
