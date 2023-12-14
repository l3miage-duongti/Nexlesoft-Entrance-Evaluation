package com.nexlesoft.evalution.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexlesoft.evalution.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);
}
