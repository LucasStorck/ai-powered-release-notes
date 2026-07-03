package org.lucas.releasenotes.dtos;

import jakarta.validation.constraints.NotBlank;

public record ReleaseNoteRequestDto(
        @NotBlank(message = "")
        String rawPatch,

        @NotBlank(message = "")
        String versionTag,

        @NotBlank(message = "")
        String repositoryName
) {
}
