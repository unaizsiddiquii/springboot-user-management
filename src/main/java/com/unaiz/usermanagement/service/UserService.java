package com.unaiz.usermanagement.service;

import com.unaiz.usermanagement.dto.UserRequestDto;
import com.unaiz.usermanagement.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserRequestDto requestDto);

    UserResponseDto getUserById(Long id);

    List<UserResponseDto> getAllUsers();

    UserResponseDto updateUser(Long id, UserRequestDto requestDto);

    void deleteUser(Long id);

}
