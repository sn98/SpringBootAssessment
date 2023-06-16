package com.example.sba.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RatingId implements Serializable {
    @JsonProperty("movie_id")
    private int movie_id;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
}
