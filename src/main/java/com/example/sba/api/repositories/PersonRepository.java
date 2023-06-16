package com.example.sba.api.repositories;

import com.example.sba.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findPeopleByName(String name);
}
