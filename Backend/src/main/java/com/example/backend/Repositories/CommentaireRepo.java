package com.example.backend.Repositories;

import com.example.backend.Entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentaireRepo extends JpaRepository<Commentaire , Integer> {
}
