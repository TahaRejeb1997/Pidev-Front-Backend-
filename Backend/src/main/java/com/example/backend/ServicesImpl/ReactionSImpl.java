package com.example.backend.ServicesImpl;


import com.example.backend.Entities.Reaction;
import com.example.backend.Repositories.ReactionRepo;
import com.example.backend.Services.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReactionSImpl implements ReactionService {
    @Autowired
    ReactionRepo repo;
    @Override
    public void add(Reaction s) {
        repo.save(s);
    }

    @Override
    public Reaction update(Reaction s) {
      return  repo.save(s);
    }

    @Override
    public List<Reaction> getAll() {
        return repo.findAll();
    }

    @Override
    public Reaction getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
            repo.deleteById(id);
    }
}
