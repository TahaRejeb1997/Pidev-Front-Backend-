package com.example.backend.Repositories;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentaireRepo extends JpaRepository<Commentaire , Integer> {

}
