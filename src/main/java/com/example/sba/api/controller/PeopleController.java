package com.example.sba.api.controller;

import com.example.sba.api.model.People;
import com.example.sba.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/people")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService){
        this.peopleService = peopleService;
    }

    @GetMapping
    public List<People> getPeople(){
        return peopleService.getPeople();
    }
    @GetMapping(path = "{personId}")
    public Optional<People> getPersonById(@PathVariable("personId") Integer personId){
        return peopleService.getPersonById(personId);
    }
    @PostMapping
    public void registerNewPerson(@RequestBody People people){
        peopleService.addNewPerson(people);
    }

    @DeleteMapping(path = "{peopleId}")
    public void deletePerson(@PathVariable("peopleId") Integer peopleId){
        peopleService.deletePerson(peopleId);
    }

    @PutMapping(path = "{peopleId}/{name}")
    public void updatePerson(@PathVariable("peopleId") Integer peopleId,
                           @PathVariable(required = false) String name){
        peopleService.updatePerson(peopleId, name);
    }
}
