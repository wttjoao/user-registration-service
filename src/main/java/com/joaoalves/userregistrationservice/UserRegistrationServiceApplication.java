package com.joaoalves.userregistrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class UserRegistrationServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(UserRegistrationServiceApplication.class, args);
        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "joaoalves1102@outlook.pt", "joao", "João Alves"));

    }

}
