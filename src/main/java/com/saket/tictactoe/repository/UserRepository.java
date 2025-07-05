package com.saket.tictactoe.repository;

import com.saket.tictactoe.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserData, UUID> {
}
