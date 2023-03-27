package com.example.backend.Services;

import com.example.backend.Entities.Post;
import com.example.backend.Entities.Reaction;

import java.util.List;

public interface ReactionService {
    void add(Reaction s);
    Reaction  update(Reaction  s);
    List<Reaction > getAll();

    Reaction getById(int id);
    void remove(int id);
}
