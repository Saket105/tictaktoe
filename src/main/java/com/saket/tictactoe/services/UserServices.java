package com.saket.tictactoe.services;

import com.saket.tictactoe.model.UserData;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserServices {
    UserData createUser(UserData userData);

    List<UserData> getAllUser();

    Optional<UserData> getUser(UUID id);

    void deleteUser(UUID id);
}
