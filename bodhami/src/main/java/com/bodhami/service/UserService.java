package com.bodhami.service;

import com.bodhami.dto.UserDTO;
import com.bodhami.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserDTO userDTO);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO getUserById(Long id);
    UserResponseDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);  // 🔧 ADD THIS
}