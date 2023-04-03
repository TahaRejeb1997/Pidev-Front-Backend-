package com.example.backend.Repositories;

import com.example.backend.Entities.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepo extends JpaRepository<Reaction, Integer> {

}
