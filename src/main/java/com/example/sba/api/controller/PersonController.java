package com.example.sba.api.controller;

import com.example.sba.api.model.Person;
import com.example.sba.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeople(){
        return personService.getPeople();
    }
    @GetMapping(path = "{personId}")
    public Optional<Person> getPersonById(@PathVariable("personId") Integer personId){
        return personService.getPersonById(personId);
    }
    @PostMapping
    public void registerNewPerson(@RequestBody Person person){
        personService.addNewPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Integer personId){
        personService.deletePerson(personId);
    }

    @PutMapping(path = "{personId}/{name}")
    public void updatePerson(@PathVariable("personId") Integer personId,
                           @PathVariable(required = false) String name){
        personService.updatePerson(personId, name);
    }
}
