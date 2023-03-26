package com.example.backend.ServicesImpl;

import com.example.backend.Entities.User;
import com.example.backend.Repositories.UserRepo;
import com.example.backend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserSImpl implements UserService {
    @Autowired
    private UserRepo repo;

    @Override
    public void add(User s) {

    }

    @Override
    public User update(User s) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
