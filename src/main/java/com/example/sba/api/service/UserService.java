package com.example.sba.api.service;

import com.example.sba.api.model.User;
import com.example.sba.api.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<User> getUser(){
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());
        if (userByEmail.isPresent()){
            throw new IllegalStateException("email already exists");
        }
        userRepository.save(user);
        System.out.println(user);
    }

    public void deleteUser(Integer userId) {
        boolean exists = userRepository.existsById(userId);
        if(!exists){
            throw new IllegalStateException("user with id " + userId + " does not exist");
        }
        userRepository.deleteById(userId);
    }
    @Transactional
    public void updateUser(Integer userId, Integer role, String email, String password) {
        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException("user with id " + userId + " does not exist"));
//        if (role != null && !Objects.equals(user.getRole(), role)){
//            //Checking if the new role is not the same as the old current one
//            user.setRole(role);
//        }

        System.out.println("the damn email " +email);

        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)){
            System.out.println("the damn email " +email);
            Optional<User> userOptional = userRepository.findUserByEmail(email);
            if (userOptional.isPresent()){
                throw new IllegalStateException("email already exists");
            }
            user.setEmail(email);
        }

//        if (password != null && password.length()>=8 && !Objects.equals(user.getPassword(), password)){
//            user.setPassword(password);
//        }
    }
}
