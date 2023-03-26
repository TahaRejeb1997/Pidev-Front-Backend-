package com.example.backend.Repositories;

import com.example.backend.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo  extends JpaRepository<User, Integer> {
}
