package com.saket.tictactoe.controller;

import com.saket.tictactoe.model.UserData;
import com.saket.tictactoe.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/users")
public class UserController {
    @Autowired
    private UserServices userServices;

    @PostMapping
    public ResponseEntity<UserData> createUser(@RequestBody UserData userData){
        UserData newUserData = userServices.createUser(userData);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUserData);
    }

    @GetMapping
    public ResponseEntity<List<UserData>> getAllUser(){
        List<UserData> userDataList = userServices.getAllUser();
        return ResponseEntity.status(HttpStatus.FOUND).body(userDataList);
    }
}
