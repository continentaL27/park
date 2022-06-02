package com.conti.parkrestapi.repository;

import com.conti.parkrestapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, UUID> {
}
