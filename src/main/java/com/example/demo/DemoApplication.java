package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


    private final User me;
    private final User sister;
    private final User brother;
    private final User father;
    private final User mother;


    public DemoApplication(User me,User sister,User brother,User father,User mother) {
        this.me = me;
        this.sister = sister;
        this.brother = brother;
        this.father = father;
        this.mother = mother;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @PostConstruct
    public void init(){
        System.out.println("Me: "+me);
        System.out.println("Sister: "+sister);
        System.out.println("Brother: "+brother);
        System.out.println("Father: "+father);
        System.out.println("Mother: "+mother);
    }

}
