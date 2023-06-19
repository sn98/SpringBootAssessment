package com.example.sba.api.repositories;

import com.example.sba.api.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
//    @Query("SELECT m FROM Movie m WHERE m.id=4")
//    List<Movie> getEmAll();

}
