package com.example.demo.service;

import com.example.demo.dto.RegistrationDto;
import com.example.demo.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);


    UserEntity findByUsername(String username);
}
