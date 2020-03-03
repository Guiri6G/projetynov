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

import projetynov.model.User;
import projetynov.repositories.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping(value = "/users")
	public List<User> getUsers() {
		System.out.println("trace getUsers");
		List<User> users = new ArrayList<User>(); 
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	@PostMapping(value = "/add") 
	public void addUser(@RequestBody User u) {
		userRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateUser(@RequestBody User u) {
		userRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteUser(@RequestBody User u) {
		userRepository.delete(u);
	}	
	
	
	@PostMapping(value = "/login")
	public Optional<User> login(@RequestBody User u) {
		return userRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword());
	}
 	
}
