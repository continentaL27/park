package com.conti.parkrestapi.controller;

import com.conti.parkrestapi.model.Note;
import com.conti.parkrestapi.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class NoteController {

    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @GetMapping("/notesq/")
    public List<Note> getNotesInDateRange(LocalDate from, LocalDate to) {
        return noteService.getNotesInDateRange(from, to);
    }

    @PostMapping("/notes")
    public Note createNote(Note note) {
        return noteService.createNote(note);
    }

    @PutMapping("/notes")
    public Note updateNote(Long noteId) {
        return noteService.updateNote(noteId);
    }
}
