package com.example.backend.ServicesImpl;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Repositories.CommentaireRepo;
import com.example.backend.Services.CommentaireSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentaireSImpl implements CommentaireSer {
    @Autowired
    private CommentaireRepo repo;

    @Override
    public void add(Commentaire s) {
        repo.save(s);
    }

    @Override
    public Commentaire update(Commentaire s) {
        return null;
    }

    @Override
    public List<Commentaire> getAll() {
        return null;
    }

    @Override
    public Commentaire getById(int id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
