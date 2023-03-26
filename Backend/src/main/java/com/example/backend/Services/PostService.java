package com.example.backend.Services;

import com.example.backend.Entities.Post;

import java.util.List;

public interface PostService {

    void add(Post  s);
    Post  update(Post  s);
    List<Post > getAll();

    Post getById(int id);
    void remove(long id);

}
