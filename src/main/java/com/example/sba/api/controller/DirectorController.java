package com.example.sba.api.controller;

import com.example.sba.api.model.Director;
import com.example.sba.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/directors")
public class DirectorController {
    private final DirectorService directorService;

    @Autowired
    public DirectorController(DirectorService directorService){
        this.directorService = directorService;
    }

    @GetMapping
    public List<Director> getDirectors(){
        return directorService.getDirectors();
    }
}
