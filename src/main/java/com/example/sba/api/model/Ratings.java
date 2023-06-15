package com.example.sba.api.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigInteger;

@Table(name = "movies_ratings")
public class Ratings {
    @Id
    private BigInteger movie_id;
    private BigInteger ratings_movie_id;
    public Ratings(BigInteger movie_id, BigInteger ratings_movie_id){
        this.movie_id = movie_id;
        this.ratings_movie_id = ratings_movie_id;
    }
    public BigInteger setMovieId(){
        return movie_id;
    }

    public void setMovieId(BigInteger movie_id){
        this.movie_id = movie_id;
    }

    public BigInteger getMPersonId(){
        return ratings_movie_id;
    }

    public void setMPersonId(BigInteger ratings_movie_id){
        this.ratings_movie_id = ratings_movie_id;
    }
}
