package com.bodhami.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bodhami.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    // You get save(), findAll(), findById(), deleteById(), etc. for free!
}