package com.example.sba.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class DirectorId implements Serializable {
    @JsonProperty("movie_id")
    private int movie_id;
    @JsonProperty("person_id")
    private int person_id;

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
