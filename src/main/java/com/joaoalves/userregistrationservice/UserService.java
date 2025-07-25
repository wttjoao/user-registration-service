package com.joaoalves.userregistrationservice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        System.out.println("UserService created");
    }

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
