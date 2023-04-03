package com.example.backend.Services;


import com.example.backend.Entities.PostTopics;

import java.util.List;

public interface TopicsService {
    void add(PostTopics s);
    PostTopics  update(PostTopics  s);
    List<PostTopics > getAll();

    PostTopics getByname(String name);
    void remove(int id);
    void addviwes(int id);
    List<PostTopics> findByUser(int id);
}
