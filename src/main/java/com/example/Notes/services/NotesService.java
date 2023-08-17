package com.example.Notes.services;

import com.example.Notes.dtos.NotesDto;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface NotesService {
    NotesDto createNote(NotesDto notesDto, Integer userId);

    NotesDto updateNote(NotesDto notesDto, Integer notesId);

    void deleteNote(Integer notesId);

    NotesDto getNote(Integer notesId);

    List<NotesDto> getAllNote();

    List<NotesDto> getNoteByUser(Integer userId);
}
