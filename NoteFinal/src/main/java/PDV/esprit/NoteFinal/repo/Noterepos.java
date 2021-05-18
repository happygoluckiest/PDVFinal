package PDV.esprit.NoteFinal.repo;

import java.util.Optional;
import PDV.esprit.NoteFinal.exception.UserNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import PDV.esprit.NoteFinal.model.Note;

public interface Noterepos extends JpaRepository<Note, Long> {

	void deleteNoteById(Long id);

	Optional <Note> findNoteById(long id);

}
