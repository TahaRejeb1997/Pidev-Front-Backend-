package com.example.backend.Repositories;

import com.example.backend.Entities.PostTopics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Topics extends JpaRepository<PostTopics , Integer> {
    PostTopics findByNameTopic(String nameTopic);
}
