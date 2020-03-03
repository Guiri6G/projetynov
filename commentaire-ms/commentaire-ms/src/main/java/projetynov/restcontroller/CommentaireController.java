package projetynov.restcontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetynov.model.commentaire;
import projetynov.repositories.CommentaireRepository;

@RestController
public class CommentaireController {

	@Autowired
	private CommentaireRepository CommentaireRepository;
	
	@GetMapping(value = "/commentaire/{id}")
	public Optional<Commentaire> getCommentaire(@PathVariable Long id) {
		return CommentaireRepository.findById(id);
	}
	
	@GetMapping(value = "/commentaires")
	public List<Commentaire> getCommentaires() {
		System.out.println("trace get");
		List<Commentaire> commentaires = new ArrayList<Commentaire>(); 
		CommentaireRepository.findAll().forEach(commentaires::add);
		return commentaires;
	}
	
	@PostMapping(value = "/add") 
	public void addCommentaire(@RequestBody Commentaire u) {
		CommentaireRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateCommentaire(@RequestBody Commentaire u) {
		CommentaireRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteCommentaire(@RequestBody Commentaire u) {
		CommentaireRepository.delete(u);
	}	
	
}
