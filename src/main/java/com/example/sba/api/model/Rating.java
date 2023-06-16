package com.example.sba.api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;
@Entity
@Table(name = "ratings")
public class Rating  {
    @Id
    private int movie_id;
    private double rating;
    private int votes;
    public Rating(int movie_id, double rating, int votes){
        this.movie_id = movie_id;
        this.rating = rating;
        this.votes = votes;
    }

    public Rating() {

    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }
    public int getVotes(){
        return votes;
    }

    public void setVotes(int votes){
        this.votes = votes;
    }

}
