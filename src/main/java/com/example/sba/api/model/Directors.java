package com.example.sba.api.model;

import jakarta.persistence.*;

@Table(name = "directors")
public class Directors {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private int movie_id;

    private int person_id;

    public Directors(int movie_id, int person_id){
        this.movie_id = movie_id;
        this.person_id = person_id;
    }

    public int setMovieId(){
        return movie_id;
    }

    public void setMovieId(int movie_id){
        this.movie_id = movie_id;
    }

    public int getMPersonId(){
        return person_id;
    }

    public void setMPersonId(int person_id){
        this.person_id = person_id;
    }
}
