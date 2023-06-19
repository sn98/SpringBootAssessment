package com.example.sba.api.service;

import com.example.sba.api.model.Movie;
import com.example.sba.api.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Page<Movie> getPaginatedMovies(int offset, int pageSize) {
        return movieRepository.findAll(PageRequest.of(offset, pageSize));
    }

    public List<Movie> sortMovies(String field) {
        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

}
