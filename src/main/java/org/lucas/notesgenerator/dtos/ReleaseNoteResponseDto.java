package org.lucas.notesgenerator.dtos;

import org.lucas.notesgenerator.models.User;

import java.time.LocalDateTime;

public record ReleaseNoteResponseDto(String markdownSummary, String modelUsed, LocalDateTime createdAt, User user) {
}
