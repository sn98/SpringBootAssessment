package com.example.sba.api.repositories;

import com.example.sba.api.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer> {}
