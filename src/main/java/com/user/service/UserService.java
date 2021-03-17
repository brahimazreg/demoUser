package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.user.Exception.ResourceNotFoundException;
import com.user.dao.UserRepository;
import com.user.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	// get all users
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	// get user by Id
	
	public User getUserById(int id) {
		User user =  userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User doesn't exist with the id =" +id));
		
				
		return user;
	}
	
	// create user
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

	// update user
	public User updateUser(int id) {
		User user = getUserById(id);
		return userRepository.save(user);
	}
	
	//delete user
	public User deleteUser(int id) {
		User user = getUserById(id);
		userRepository.delete(user);
		return user;
	}
}
