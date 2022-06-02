package com.conti.parkrestapi.service;

import com.conti.parkrestapi.model.Note;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NoteService {

    private List<Note> noteList;

    public NoteService() {
        noteList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            noteList.add(new Note(UUID.randomUUID(), LocalDateTime.now(), LocalDateTime.now()));
        }
    }

    public Note createNote(Note note) {
        throw new UnsupportedOperationException();
    }

    public Note updateNote(Long id) {
        throw new UnsupportedOperationException();
    }

    public List<Note> getNotes() {
        return List.copyOf(noteList);
    }

    public List<Note> getNotesInDateRange(LocalDate from, LocalDate to) {
        throw new UnsupportedOperationException();
    }
}
