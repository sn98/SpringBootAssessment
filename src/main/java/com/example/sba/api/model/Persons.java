package com.example.sba.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;
@Table(name = "person")
public class Persons {
    @Id
    private BigInteger id;
    private int age;
    private String first_name;
    private String last_name;

    public Persons(BigInteger id, int age, String first_name, String last_name){
        this.id = id;
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Persons() {

    }

    public BigInteger getId(){
        return id;
    }

    public void setId(BigInteger id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getFirstname(){ return first_name; }

    public void setFirstname(String first_name){ this.first_name = first_name; }

    public String getLastname(){
        return last_name;
    }

    public void setLastname(String last_name){
        this.last_name = last_name;
    }
}
