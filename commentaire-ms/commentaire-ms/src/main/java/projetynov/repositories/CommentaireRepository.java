package projetynov.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetynov.model.commentaire;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Long>{
	
	public commentaire findByid(Long id);
	
	
}