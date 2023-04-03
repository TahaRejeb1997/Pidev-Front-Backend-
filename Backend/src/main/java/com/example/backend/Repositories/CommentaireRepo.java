package com.example.backend.Repositories;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepo extends JpaRepository<Commentaire , Integer> {
    List<Commentaire> findAllByPost_idPostesOrderByDateComment(int id);

    Commentaire findByPost_IdPostesAndIdComment(int idPostes, int idComment);


}
