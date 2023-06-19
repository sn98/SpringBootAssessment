package com.example.sba.api.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "directors")
@IdClass(DirectorId.class)
public class Director implements Serializable {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private Movie movie_id;
    //
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person_id;

//    public Director(int movie_id, int person_id){
//        this.movie_id = movie_id;
//        this.person_id = person_id;
//    }

    public Director() {

    }
//
//    public int setMovieId(){
//        return movie_id;
//    }
//
//    public void setMovieId(int movie_id){
//        this.movie_id = movie_id;
//    }
//
//    public int getMPersonId(){
//        return person_id;
//    }
//
//    public void setMPersonId(int person_id){
//        this.person_id = person_id;
//    }
}
