package PDV.esprit.NoteFinal.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PDV.esprit.NoteFinal.exception.UserNotFoundException;
import PDV.esprit.NoteFinal.model.Note;
import PDV.esprit.NoteFinal.repo.Noterepos;


@Service
@Transactional
public class NoteService {
	
	private final Noterepos noterepos;
	
	
	
	@Autowired
	public NoteService(Noterepos noterepos) {
		this.noterepos=noterepos;
	}
	
	
	
	public Note addNote(Note note) {
		note.setPostID(UUID.randomUUID().toString());
		return noterepos.save(note);
	}
	
	public List<Note> findAllNotes(){
		return noterepos.findAll();
	}
	
	public Note updateNote(Note note) {
		return noterepos.save(note);
	}
	
	public void deleteNote(Long id) {
		noterepos.deleteNoteById(id);
	}
	
	public Note findNoteById(long id) {
		return noterepos.findNoteById(id).orElseThrow(() ->new UserNotFoundException("use by id:"+id+" was not found"));
	}



}
