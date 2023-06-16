package com.example.sba.api.controller;

import com.example.sba.api.model.User;
import com.example.sba.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUser();
    }
    @PostMapping
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId){
        userService.deleteUser(userId);
    }

    @PutMapping(path = "{userId}/{username}")
    public void updateUser(@PathVariable("userId") Integer userId,
                           @PathVariable(required = false) String username,
                           @PathVariable(required = false) String password){
        userService.updateUser(userId, username, password);
    }
}
