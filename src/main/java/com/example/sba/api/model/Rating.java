package com.example.sba.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;
@Entity
@Table(name = "ratings")
public class Rating {
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

    public int setMovieId(){
        return movie_id;
    }

    public void setMovieId(int movie_id){
        this.movie_id = movie_id;
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
