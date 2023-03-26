package com.example.backend.Repositories;

import com.example.backend.Entities.UserOrgType;
import org.springframework.data.repository.CrudRepository;

public interface UserOrgTyRepo extends CrudRepository<UserOrgType,Integer> {
}
