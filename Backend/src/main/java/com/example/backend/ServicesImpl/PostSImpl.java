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
        repo.save(s);
    }

    @Override
    public Post update(Post s) {
        return null;
    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post getById(int id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
