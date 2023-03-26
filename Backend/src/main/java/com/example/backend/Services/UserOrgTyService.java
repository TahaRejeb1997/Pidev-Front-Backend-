package com.example.backend.Services;

import com.example.backend.Repositories.UserOrgTyRepo;

import java.util.List;

public interface UserOrgTyService {

    void add(UserOrgTyRepo s);
    UserOrgTyRepo update(UserOrgTyRepo s);
    List<UserOrgTyRepo> getAll();

    UserOrgTyRepo getById(Integer id);
    void remove(long id);


}
