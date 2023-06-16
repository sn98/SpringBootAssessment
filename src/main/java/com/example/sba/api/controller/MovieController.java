package com.example.sba.api.controller;

import com.example.sba.api.dto.APIResponse;
import com.example.sba.api.model.Movie;
import com.example.sba.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/{offset}/{pageSize}")
    public APIResponse<Page<Movie>> getPaginatedMovies(@PathVariable int offset, @PathVariable int pageSize){
        Page<Movie> result = movieService.getPaginatedMovies(offset,pageSize);
        return new APIResponse<>(result.getSize(), result);
    }
    @GetMapping("/{field}")
    public List<Movie> sortMovies( @PathVariable String field){
        List<Movie> result = movieService.sortMovies(field);
        return result;
//        return new APIResponse<>(result.size(), result);
    }


}
