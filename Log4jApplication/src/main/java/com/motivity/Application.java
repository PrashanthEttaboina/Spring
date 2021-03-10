package com.motivity;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext cac= SpringApplication.run(Application.class, args);
       Runner r=cac.getBean(Runner.class);
       r.run();
     
       
    }
}