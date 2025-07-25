package com.joaoalves.userregistrationservice;

public interface NotificationService {
    void send(String message, String recipientEmail);
}
