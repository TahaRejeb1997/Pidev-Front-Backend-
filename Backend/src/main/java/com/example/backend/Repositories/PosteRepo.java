package com.example.backend.Repositories;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface PosteRepo  extends JpaRepository<Post, Integer> {

List<Post> findByTitleP(String title);

}
