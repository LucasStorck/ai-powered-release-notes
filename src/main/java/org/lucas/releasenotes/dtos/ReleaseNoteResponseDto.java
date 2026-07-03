package org.lucas.releasenotes.dtos;

import org.lucas.releasenotes.models.User;

import java.time.LocalDateTime;

public record ReleaseNoteResponseDto(String markdownSummary, String modelUsed, LocalDateTime createdAt, User user) {
}
