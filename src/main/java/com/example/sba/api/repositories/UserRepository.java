package com.example.sba.api.repositories;

import com.example.sba.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    //SELECT * FROM users WHERE email = ?
//    @Query("SELECT u FROM Users u WHERE u.email = ?1")
    Optional<User> findUserByUsername(String username);
}
