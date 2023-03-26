package com.example.backend.ServicesImpl;

import com.example.backend.Entities.Organisation;
import com.example.backend.Repositories.OrgRepo;
import com.example.backend.Services.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgSmpl implements OrgService {
    @Autowired
    private  OrgRepo repo;

    @Override
    public void add(Organisation s) {

    }

    @Override
    public Organisation update(Organisation s) {
        return null;
    }

    @Override
    public List<Organisation> getAll() {
        return null;
    }

    @Override
    public Organisation getById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
