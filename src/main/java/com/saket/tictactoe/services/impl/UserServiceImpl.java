package com.saket.tictactoe.services.impl;

import com.saket.tictactoe.model.UserData;
import com.saket.tictactoe.repository.UserRepository;
import com.saket.tictactoe.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserData createUser(UserData userData) {
        UserData userData1 = UserData.builder()
                .email(userData.getEmail())
                .name(userData.getName())
                .password(userData.getPassword())
                .userId(UUID.randomUUID())
                .build();
        return userRepository.save(userData1);
    }

    @Override
    public List<UserData> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserData> getUser(UUID id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(UUID id) {
        Optional<UserData> userData = userRepository.findById(id);
        if (userData.isPresent()){
            userRepository.deleteById(id);
        }
    }
}
