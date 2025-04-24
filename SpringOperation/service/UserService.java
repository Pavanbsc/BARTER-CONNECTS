package com.MainProject.SpringOperation.service;

import com.MainProject.SpringOperation.entity.Users;
import com.MainProject.SpringOperation.repository.UsersRepo;
import com.MainProject.SpringOperation.requests.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsersRepo usersRepo;

    public Optional<Users> loginUser(LoginRequest loginRequest) {
        // Validate user credentials by email and password
        return usersRepo.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());
    }

    public Users registerUser(Users user) {
        // Check if user already exists based on email
        Optional<Users> existingUser = usersRepo.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("User with this email already exists!");
        }
        // Save the user, using email as unique identifier
        return usersRepo.save(user);
    }
}
