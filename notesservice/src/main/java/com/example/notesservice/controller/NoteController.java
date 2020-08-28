package com.example.notesservice.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notesservice.dto.NotesDto;
import com.example.notesservice.model.Note;
import com.example.notesservice.service.NoteService;
import static com.example.notesservice.utils.NotesUtilities.convertToNoteDto;
@RestController
@RequestMapping("/noteservice")
public class NoteController {
	
	@Autowired
	private NoteService noteService;

	@GetMapping("/all")
	public ResponseEntity<List<NotesDto>> findAll(){
		 return null;
	}
	
	@PostMapping("/add")
	public ResponseEntity<NotesDto> addNote(@RequestBody NotesDto note){
		return null;
    }
	
	@DeleteMapping("/delete")
	public ResponseEntity<NotesDto> deleteNote(@RequestBody NotesDto note){
		return null;
	}
	
	@GetMapping("/note/{id}")
	public ResponseEntity<NotesDto> findById(@PathVariable("id") int id){
		return null;
	}
	
	@GetMapping("/{status}")
	public ResponseEntity<List<NotesDto>> findAllByStatus(@PathVariable("status") String status){
		return null;
	}
	
}
