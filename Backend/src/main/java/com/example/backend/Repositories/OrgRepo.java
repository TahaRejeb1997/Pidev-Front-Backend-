package com.example.backend.Repositories;

import com.example.backend.Entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgRepo extends JpaRepository<Organisation,Integer> {
}
