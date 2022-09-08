package com.example.bosonit53;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageController1 {

    @PostConstruct
    public void PostConstruct (){
        System.out.println("Hola desde la clase inicial");
    }

    @Bean("bean1")
    public String controller1 (){
        return "Hola desde clase secundaria";
    }

    @Bean("bean2")
    public String controller2 (){
        return "soy la clase tercera";
    }

}
