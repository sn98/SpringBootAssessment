package com.example.sba.api.repositories;

import com.example.sba.api.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<People, Integer> {
    Optional<People> findPeopleByName(String name);
}
