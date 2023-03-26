package com.example.backend.Services;

import com.example.backend.Entities.User;

import java.util.List;

public interface UserService {

    void add(User s);
    User update(User s);
    List<User> getAll();

    User getById(Long id);
    void remove(long id);


}
