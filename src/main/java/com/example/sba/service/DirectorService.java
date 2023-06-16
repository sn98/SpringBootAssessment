package com.example.sba.service;

import com.example.sba.api.model.Director;
import com.example.sba.api.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DirectorService {
    private final DirectorRepository directorRepository;
    @Autowired
    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }


    public List<Director> getDirectors(){
        return directorRepository.findAll();
    }
}
