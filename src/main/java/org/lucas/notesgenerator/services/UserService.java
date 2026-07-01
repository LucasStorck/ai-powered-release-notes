package org.lucas.notesgenerator.services;

import org.lucas.notesgenerator.dtos.UserRequestDto;
import org.lucas.notesgenerator.dtos.UserResponseDto;
import java.util.List;
import java.util.UUID;

public interface UserService {

  UserResponseDto createUser(UserRequestDto userRequestDto);

  UserResponseDto getUserById(UUID id);

  List<UserResponseDto> getAllUsers();

  UserResponseDto updateUser(UUID id, UserRequestDto userRequestDto);

  void deleteUser(UUID id);
}
