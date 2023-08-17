package com.example.Notes.repositories;

import com.example.Notes.models.entitys.Notes;
import com.example.Notes.models.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NotesRepository extends JpaRepository<Notes,Integer> {
    List<Notes> findByUser(Optional<User> user);
}
