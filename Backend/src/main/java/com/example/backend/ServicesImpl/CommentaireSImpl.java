package com.example.backend.ServicesImpl;

import com.example.backend.Entities.Commentaire;
import com.example.backend.Entities.Post;
import com.example.backend.Repositories.CommentaireRepo;
import com.example.backend.Repositories.PosteRepo;
import com.example.backend.Services.CommentaireSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentaireSImpl implements CommentaireSer {
    @Autowired
    private PosteRepo reo2;
    @Autowired
    private CommentaireRepo repo;

    @Override
    public void add(Commentaire s) {
        repo.save(s);
    }

    @Override
    public Commentaire update(Commentaire s) {
        return repo.save(s);
    }

    @Override
    public List<Commentaire> getAll() {
        return repo.findAll();
    }

    @Override
    public Commentaire getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) { repo.deleteById(id);

    }

    
}
