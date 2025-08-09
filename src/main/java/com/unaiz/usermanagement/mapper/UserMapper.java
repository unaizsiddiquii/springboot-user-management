package com.unaiz.usermanagement.mapper;

import com.unaiz.usermanagement.dto.UserRequestDto;
import com.unaiz.usermanagement.dto.UserResponseDto;
import com.unaiz.usermanagement.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequestDto dto);

    UserResponseDto toResponseDto(User user);
}
