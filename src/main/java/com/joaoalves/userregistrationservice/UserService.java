package com.joaoalves.userregistrationservice;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
        System.out.println("UserService created");
    }

    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.send("User registado. Email", user.getEmail());
    }
}
