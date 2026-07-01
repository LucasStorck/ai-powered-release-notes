package org.lucas.notesgenerator.repositories;

import org.lucas.notesgenerator.models.ReleaseNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ReleaseNoteRepository extends JpaRepository<ReleaseNote, UUID> {
}
