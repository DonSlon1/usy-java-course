package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public User sister(@Value("${sister.firstname}") String firstName, @Value("${sister.lastname}") String lastName) {
        User user =  new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
    @Bean
    public User brother(@Value("${brother.firstname}") String firstName, @Value("${brother.lastname}") String lastName) {
        User user =  new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
    @Bean
    public User father(@Value("${father.firstname}") String firstName, @Value("${father.lastname}") String lastName) {
        User user =  new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
    @Bean
    public User mother(@Value("${mother.firstname}") String firstName, @Value("${mother.lastname}") String lastName) {
        User user =  new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
    @Bean
    public User me(@Value("${me.firstname}") String firstName, @Value("${me.lastname}") String lastName) {
        User user =  new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
}
