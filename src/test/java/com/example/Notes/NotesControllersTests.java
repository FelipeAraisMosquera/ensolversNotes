package com.example.Notes;

import com.example.Notes.controllers.NotesController;
import com.example.Notes.dtos.ApiRes;
import com.example.Notes.dtos.NotesDto;
import com.example.Notes.services.NotesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class NotesControllersTests {
    @InjectMocks
    private NotesController notesController;

    @Mock
    private NotesService notesService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testCreateNote() {
        NotesDto inputNote = new NotesDto();
        int userId = 123;

        NotesDto createdNote = new NotesDto();
        when(notesService.createNote(inputNote, userId)).thenReturn(createdNote);

        ResponseEntity<NotesDto> response = notesController.createNote(inputNote, userId);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(createdNote, response.getBody());
    }

    @Test
    void testUpdateNote() {

        NotesDto inputNote = new NotesDto();
        int notesId = 456;

        NotesDto updatedNote = new NotesDto();
        when(notesService.updateNote(inputNote, notesId)).thenReturn(updatedNote);

        ResponseEntity<NotesDto> response = notesController.updateNote(inputNote, notesId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(updatedNote, response.getBody());
    }

    @Test
    void testDeleteNote() {
        int notesId = 789;

        ResponseEntity<ApiRes> response = notesController.deleteNote(notesId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        verify(notesService, times(1)).deleteNote(notesId);
    }

    @Test
    void testGetNotesByUser() {
        int userId = 123;

        List<NotesDto> notesList = new ArrayList<>();
        ResponseEntity<List<NotesDto>> response = notesController.getNotesByUser(userId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(notesList, response.getBody());
    }

    @Test
    void testGetNotes() {
        List<NotesDto> notesList = new ArrayList<>();
        when(notesService.getAllNote()).thenReturn(notesList);

        ResponseEntity<List<NotesDto>> response = notesController.getNotes();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(notesList, response.getBody());
    }
}
