package com.example.backend.ServicesImpl;

import com.example.backend.Entities.Post;
import com.example.backend.Entities.PostTopics;
import com.example.backend.Repositories.Topics;
import com.example.backend.Services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostTopicSImpl implements TopicsService {
    @Autowired
    Topics topics;
    @Override
    public void add(PostTopics s) {
        topics.save(s);

    }

    @Override
    public PostTopics update(PostTopics s) {
        return  topics.save(s);
    }

    @Override
    public List<PostTopics> getAll() {
        return topics.findAll();
    }

    @Override
    public PostTopics getByname(String name) {
        return topics.findByNameTopic(name);
    }

    @Override
    public void remove(int id) {
        topics.deleteById(id);
    }

    @Override
    public void addviwes(int id) {
        PostTopics p1 = topics.getById(id);
        int x = p1.getWanted();

        x=x+1;
        p1.setWanted(x);
        topics.save(p1);
    }

    @Override
    public List<PostTopics> findByUser(int id) {
        return null;
    }
}
