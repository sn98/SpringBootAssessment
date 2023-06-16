package com.example.sba.service;

import com.example.sba.api.model.Person;
import com.example.sba.api.repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    public List<Person> getPeople(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Integer id){
        return personRepository.findById(id);
    }

    public void addNewPerson(Person person) {
        personRepository.save(person);
        System.out.println(person);
    }

    public void deletePerson(Integer personId) {
        boolean exists = personRepository.existsById(personId);
        if(!exists){
            throw new IllegalStateException("person with id " + personId + " does not exist");
        }
        personRepository.deleteById(personId);
    }
    @Transactional
    public void updatePerson(Integer personId, String name) {
        Person person = personRepository.findById(personId).orElseThrow(()-> new IllegalStateException("person with id " + personId + " does not exist"));
        if (name != null && !Objects.equals(person.getName(), name)){
            //Checking if the new role is not the same as the old current one
            person.setName(name);
        }
    }
}
