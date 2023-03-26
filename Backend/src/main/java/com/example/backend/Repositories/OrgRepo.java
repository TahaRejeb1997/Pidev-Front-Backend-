package com.example.backend.Repositories;

import com.example.backend.Entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrgRepo extends JpaRepository<Organisation,Integer> {
}
