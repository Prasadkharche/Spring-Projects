package com.passwordgenerator.password.repository;

import org.springframework.stereotype.Repository;

import com.passwordgenerator.password.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepository extends JpaRepository<user, Long>{
    
}
