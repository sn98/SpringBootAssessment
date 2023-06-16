package com.example.sba.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;
@Entity
@Table(name = "people")
public class Person {
    @Id
    private int id;
    private String name;
    private Number birth;

    public Person(int id, String name, Number birth){
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Person() {

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){ return name; }

    public void setName(String name){ this.name = name; }

    public Number setBirth(){
        return birth;
    }

    public void setBirth(Number birth){
        this.birth = birth;
    }
}
