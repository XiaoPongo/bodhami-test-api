package com.bodhami.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodhami.dto.UserDTO;
import com.bodhami.model.User;
import com.bodhami.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(UserDTO userDTO) {
        // Map DTO to Entity
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setAge(userDTO.getAge());

        // Save to DB
        return userRepo.save(user);
    }
}