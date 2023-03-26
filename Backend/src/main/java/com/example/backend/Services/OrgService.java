package com.example.backend.Services;

import com.example.backend.Entities.Organisation;

import java.util.List;

public interface OrgService {

    void add(Organisation s);
    Organisation update(Organisation s);
    List<Organisation> getAll();

    Organisation getById(int id);
    void remove(int id);


}
