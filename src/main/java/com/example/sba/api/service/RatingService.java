package com.example.sba.api.service;

import com.example.sba.api.model.Rating;
import com.example.sba.api.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RatingService {
    private final RatingRepository ratingRepository;
    @Autowired
    public RatingService(RatingRepository ratingRepository){
        this.ratingRepository = ratingRepository;
    }


    public List<Rating> getRatings(){
        return ratingRepository.findAll();
    }

}
