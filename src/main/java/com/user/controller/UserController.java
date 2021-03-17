package com.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	// get all users
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	// create user
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userService.createUser(user);
	}
	
	// get user by id
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id) ;
	}
    
	// update user
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable int id,@RequestBody User user) {
		User userUpdated = getUserById(id);
		userUpdated.setFirstName(user.getFirstName());
		userUpdated.setLastName(user.getLastName());
		userUpdated.setEmail(user.getEmail());
		
		return userService.updateUser(id);
	}
	
	// delete user
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}
