package com.example.sba.api.model;

import jakarta.persistence.*;

@Table(name = "movies")
public class Movie {
    @Id
    @OneToOne(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private int id;
    private String title;
    private Number year;

    public Movie(int id, String title, Number year){
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){ return title; }

    public void setTitle(String title){ this.title = title; }

    public Number getYear(){
        return year;
    }

    public void setYear(Number year){
        this.year = year;
    }
}
