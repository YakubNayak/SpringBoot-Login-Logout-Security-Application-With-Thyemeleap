package com.yakub.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yakub.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
