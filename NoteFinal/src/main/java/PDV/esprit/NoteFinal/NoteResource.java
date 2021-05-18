package PDV.esprit.NoteFinal;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PDV.esprit.NoteFinal.model.Note;
import PDV.esprit.NoteFinal.service.NoteService;

@RestController
@RequestMapping("/Notes")
public class NoteResource {
	private final NoteService noteservice;

	public NoteResource(NoteService noteservice) {
		this.noteservice = noteservice;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Note>> getAllNotes(){
		List<Note> notes = noteservice.findAllNotes();
		return new ResponseEntity<>(notes, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Note> getNoteById(@PathVariable("id")long id){
		Note note = noteservice.findNoteById(id);
		return new ResponseEntity<>(note, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Note> addNote(@RequestBody Note note){
		Note newnote = noteservice.addNote(note);
		return new ResponseEntity<>(newnote, HttpStatus.CREATED);
	}
	@PutMapping("update")
	public ResponseEntity<Note> updateNote(@RequestBody Note note){
		Note updatednote = noteservice.updateNote(note);
		return new ResponseEntity<>(updatednote, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable("id") long id){
		noteservice.deleteNote(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
