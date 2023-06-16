package com.example.sba.api.repositories;

import com.example.sba.api.model.Director;
import com.example.sba.api.model.DirectorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, DirectorId> {}
