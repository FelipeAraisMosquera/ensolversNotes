package com.example.Notes.controllers;

import com.example.Notes.dtos.ApiRes;
import com.example.Notes.dtos.DtoProcessingException;
import com.example.Notes.dtos.NotesDto;
import com.example.Notes.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/notes")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @PostMapping("/{userId}")
    public ResponseEntity<NotesDto> createNote(@RequestBody NotesDto notes,@PathVariable Integer userId){
        NotesDto note =  this.notesService.createNote(notes, userId);

        return new ResponseEntity<NotesDto>(note,HttpStatus.CREATED);
    }
    @PutMapping("/{notesId}")
    public ResponseEntity<NotesDto> updateNote(@RequestBody NotesDto notes,@PathVariable Integer notesId){
        NotesDto updatedNote =  this.notesService.updateNote(notes, notesId);
        return new ResponseEntity<NotesDto>(updatedNote,HttpStatus.OK);
    }
    @DeleteMapping("/{notesId}")
    public ResponseEntity<ApiRes> deleteNote(@PathVariable Integer notesId){
        this.notesService.deleteNote(notesId);
        return new ResponseEntity<ApiRes>(new ApiRes("Note deleted",true),HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<NotesDto>> getNotesByUser(@PathVariable Integer userId){
        List<NotesDto> Note=this.notesService.getNoteByUser(userId);
        return new ResponseEntity<List<NotesDto>>(Note,HttpStatus.OK);
    }

    @GetMapping()
    @CrossOrigin
    public ResponseEntity<List<NotesDto>> getNotes(){
        List<NotesDto> Note=this.notesService.getAllNote();
        return new ResponseEntity<List<NotesDto>>(Note,HttpStatus.OK);
    }

}

