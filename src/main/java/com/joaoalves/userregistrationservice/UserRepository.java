package com.joaoalves.userregistrationservice;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
