package com.example.testing.annotations;

@Service(name = "simpleService")
public class SimpleService {

    @Init
    public void initService(){
        System.out.println("initService");
    }
}
