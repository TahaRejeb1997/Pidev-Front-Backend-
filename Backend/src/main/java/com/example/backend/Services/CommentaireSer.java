package com.example.backend.Services;

import com.example.backend.Entities.Commentaire;

import java.util.List;

public interface CommentaireSer {

    void add(Commentaire s);
    Commentaire update(Commentaire s);
    List<Commentaire> getAll();

    Commentaire getById(int id);
    void remove(int id);


}
