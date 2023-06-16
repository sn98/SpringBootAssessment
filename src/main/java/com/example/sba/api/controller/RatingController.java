package com.example.sba.api.controller;

import com.example.sba.api.model.Rating;
import com.example.sba.api.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ratings")
public class RatingController {
    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService){
        this.ratingService = ratingService;
    }

    @GetMapping
    public List<Rating> getRatings(){
        return ratingService.getRatings();
    }
}
