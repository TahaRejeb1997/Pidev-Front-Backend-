package com.example.backend.ServicesImpl;

import com.example.backend.Entities.Post;
import com.example.backend.Repositories.PosteRepo;
import com.example.backend.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostSImpl implements PostService {
    @Autowired
    private  PosteRepo repo;

    @Override
    public void add(Post s) {

    }

    @Override
    public Post update(Post s) {
        return repo.save(s);
    }

    @Override
    public List<Post> getAll() {
        return repo.findAll();
    }

    @Override
    public Post getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        repo.deleteById(id);
    }
}
