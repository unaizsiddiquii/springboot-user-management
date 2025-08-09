package com.unaiz.usermanagement.service;

import com.unaiz.usermanagement.dto.UserRequestDto;
import com.unaiz.usermanagement.dto.UserResponseDto;
import com.unaiz.usermanagement.entity.User;
import com.unaiz.usermanagement.mapper.UserMapper;
import com.unaiz.usermanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.control.MappingControl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    //create User
    @Override
    public UserResponseDto createUser(UserRequestDto requestDto) {
        // DTO -> Entity
        User user = userMapper.toEntity(requestDto);
        User savedUser = userRepository.save(user);
        // Entity -> DTO
        return userMapper.toResponseDto(savedUser);
    }

    //get user
    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userMapper.toResponseDto(user);
    }

    //get All User
    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    //update User
    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto requestDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        // Update fields
        user.setFirstName(requestDto.getFirstName());
        user.setLastName(requestDto.getLastName());
        user.setEmail(requestDto.getEmail());
        user.setPassword(requestDto.getPassword());
        user.setRole(requestDto.getRole());

        User updatedUser = userRepository.save(user);
        return userMapper.toResponseDto(updatedUser);
    }

    //delete User
    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        userRepository.delete(user);
    }
}
