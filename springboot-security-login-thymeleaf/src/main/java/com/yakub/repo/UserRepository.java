package com.yakub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yakub.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
