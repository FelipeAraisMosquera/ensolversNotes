package com.example.Notes.services.impl;

import com.example.Notes.dtos.DtoProcessingException;
import com.example.Notes.dtos.NotesDto;
import com.example.Notes.dtos.UserDto;
import com.example.Notes.models.entitys.Notes;
import com.example.Notes.models.entitys.User;
import com.example.Notes.repositories.NotesRepository;
import com.example.Notes.repositories.UserRepository;
import com.example.Notes.services.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public NotesDto createNote(NotesDto notesDto, Integer userId)   {
        Optional<User> userOptional = userRepository.findById(userId);

      try{
            User user = userOptional.get();
            notesDto.setDate(new Date());
            Notes notes = DtoToNotes(notesDto);
            notes.setUser(user);
            Notes savedNotes = this.notesRepository.save(notes);
            return this.NotesToDto(savedNotes);
        } catch (Exception e){
          throw new DtoProcessingException("User with ID " + userId + " not found while processing DTO");
        }
    }



    @Override
    public NotesDto updateNote(NotesDto notesDto, Integer notesId) {
        Notes notes= this.notesRepository.findById(notesId).orElseThrow(()->new ResourceAccessException("not found"));
        notesDto.setDate(new Date());
        notes.setTitle(notesDto.getTitle());
        notes.setDate(notesDto.getDate());
        notes.setDescription(notesDto.getDescription());
        Notes res=this.notesRepository.save(notes);
        return this.NotesToDto(res);
    }

    @Override
    public void deleteNote(Integer notesId) {
        Notes notes=this.notesRepository.findById(notesId).orElseThrow();
        this.notesRepository.delete(notes);
    }

    @Override
    public NotesDto getNote(Integer notesId) {
        Notes notes=this.notesRepository.findById(notesId).orElseThrow();
        return this.NotesToDto(notes);
    }

    @Override
    public List<NotesDto> getAllNote() {
        List<Notes> notes = this.notesRepository.findAll();
        List<NotesDto> allNotes= notes.stream().map((note)->this.NotesToDto(note)).collect(Collectors.toList());
        return allNotes;
    }

    public NotesDto NotesToDto(Notes notes ) {
        NotesDto notesDto= new NotesDto();
        notesDto.setId(notes.getId());
        notesDto.setTitle(notes.getTitle());
        notesDto.setDate(notes.getDate());
        notesDto.setDescription(notes.getDescription());
        notesDto.setUserDto(this.UserToDto(notes.getUser()));

        return notesDto;
    }


    public Notes DtoToNotes(NotesDto notesDto ) {
        Notes notes= new Notes();
        notes.setId((notesDto.getId()));
        notes.setTitle(notesDto.getTitle());
        notes.setDate(notesDto.getDate());
        notes.setDescription(notesDto.getDescription());
        return notes;
    }


    @Override
    public List<NotesDto> getNoteByUser(Integer userId) {
        Optional<User> user=userRepository.findById(userId);
        List<Notes> notes = this.notesRepository.findByUser(user);
        System.out.println(user);
        List<NotesDto> allNotes= notes.stream().map((note)->this.NotesToDto(note)).collect(Collectors.toList());
        return allNotes;
    }

    public UserDto UserToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        return userDto;
    }

    public User DtoToUser(UserDto userDto ) {
        User user= new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        return user;
    }

}
