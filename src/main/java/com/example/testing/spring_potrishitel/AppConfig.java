package com.example.testing.spring_potrishitel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Quoter quoter(){
        TerminatorQuoter terminatorQuoter = new TerminatorQuoter();
        terminatorQuoter.setMessage("I'll be back!");
        return terminatorQuoter;
    }

//    @Bean
//    public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBeanPostProcessor(){
//        return new InjectRandomIntAnnotationBeanPostProcessor();
//    }
}
