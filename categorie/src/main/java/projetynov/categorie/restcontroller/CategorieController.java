package projetynov.categorie.restcontroller;

import java.util.ArrayList;
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

import projetynov.categorie.model.Categorie;
import projetynov.categorie.repositories.CategorieRepository;


@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping(value = "/categorie/{id}")
	public Optional<Categorie> getArticle(@PathVariable Long id) {
		return categorieRepository.findById(id);
	}
	
	@GetMapping(value = "/categories")
	public List<Categorie> getCategories() {
		System.out.println("trace getCategories");
		List<Categorie> categories = new ArrayList<Categorie>(); 
		categorieRepository.findAll().forEach(categories::add);
		return categories;
	}
	
	@PostMapping(value = "/add") 
	public void addArticle(@RequestBody Categorie u) {
		categorieRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateArticle(@RequestBody Categorie u) {
		categorieRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteArticle(@RequestBody Categorie u) {
		categorieRepository.delete(u);
	}	
	
}
