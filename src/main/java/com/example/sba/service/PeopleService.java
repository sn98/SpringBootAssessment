package com.example.sba.service;

import com.example.sba.api.model.People;
import com.example.sba.api.repositories.PeopleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;
    }


    public List<People> getPeople(){
        return peopleRepository.findAll();
    }

    public Optional<People> getPersonById(Integer id){
        return peopleRepository.findById(id);
    }

    public void addNewPerson(People people) {
        peopleRepository.save(people);
        System.out.println(people);
    }

    public void deletePerson(Integer peopleId) {
        boolean exists = peopleRepository.existsById(peopleId);
        if(!exists){
            throw new IllegalStateException("people with id " + peopleId + " does not exist");
        }
        peopleRepository.deleteById(peopleId);
    }
    @Transactional
    public void updatePerson(Integer peopleId, String name) {
        People people = peopleRepository.findById(peopleId).orElseThrow(()-> new IllegalStateException("people with id " + peopleId + " does not exist"));
        if (name != null && !Objects.equals(people.getName(), name)){
            //Checking if the new role is not the same as the old current one
            people.setName(name);
        }

//        if (password != null && password.length()>=8 && !Objects.equals(people.getPassword(), password)){
//            people.setPassword(password);
//        }
    }
}
