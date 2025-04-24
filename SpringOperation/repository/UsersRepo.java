package com.MainProject.SpringOperation.repository;

import com.MainProject.SpringOperation.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, String> {

    Optional<Users> findByEmailAndPassword(String email, String password);

    Optional<Users> findByEmail(String email); // For checking if user already exists
}
