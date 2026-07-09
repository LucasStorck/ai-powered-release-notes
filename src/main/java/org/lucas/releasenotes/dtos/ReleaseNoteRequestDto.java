package org.lucas.releasenotes.dtos;

import jakarta.validation.constraints.NotBlank;

public record ReleaseNoteRequestDto(
        @NotBlank(message = "O Patch (rawPatch) não pode estar vazio")
        String rawPatch,

        @NotBlank(message = "A tag de versão é obrigatória")
        String versionTag,

        @NotBlank(message = "O nome do repositório é obrigatório")
        String repositoryName
) {
}
