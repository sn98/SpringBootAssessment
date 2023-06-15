package com.example.sba.api.model;

import jakarta.persistence.*;

@Entity(name = "Users")
//@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String password;
    private int role;
    private String username;
    private String email;

    public User(String password, int role, String username, String email){
        this.password = password;
        this.role = role;
        this.username = username;
        this.email = email;
    }

    public User() {

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public int getRole(){
        return role;
    }

    public void setRole(int role){
        this.role = role;
    }
    public String getUsername(){ return username; }

    public void setUsername(String username){ this.username = username; }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
