package org.lucas.notesgenerator.dtos;

import java.util.UUID;

public record UserResponseDto(UUID id, String username, String email) {
}
