package com.example.backend.ServicesImpl;

import com.example.backend.Repositories.UserOrgTyRepo;
import com.example.backend.Services.UserOrgTyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOrgTySImpl implements UserOrgTyService {
    @Autowired

    private  UserOrgTyRepo repo;

    @Override
    public void add(UserOrgTyRepo s) {

    }

    @Override
    public UserOrgTyRepo update(UserOrgTyRepo s) {
        return null;
    }

    @Override
    public List<UserOrgTyRepo> getAll() {
        return null;
    }

    @Override
    public UserOrgTyRepo getById(Integer id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }
}
