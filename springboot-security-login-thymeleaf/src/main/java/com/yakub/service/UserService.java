package com.yakub.service;

import com.yakub.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
