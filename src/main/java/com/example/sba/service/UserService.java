package com.example.sba.service;

import com.example.sba.api.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUser(){
        return List.of(
                new User(
                        "12345678",
                        0,
                        "sean",
                        "seangayle995@gmail.com"
                )
        );
    }
}
