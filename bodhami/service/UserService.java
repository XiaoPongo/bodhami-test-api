package com.bodhami.service;

import com.bodhami.dto.UserDTO;
import com.bodhami.model.User;

public interface UserService {
    User createUser(UserDTO userDTO);
}