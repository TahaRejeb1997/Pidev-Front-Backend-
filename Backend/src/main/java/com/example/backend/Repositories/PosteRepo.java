package com.example.backend.Repositories;

import com.example.backend.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PosteRepo  extends JpaRepository<Post, Integer> {
}
