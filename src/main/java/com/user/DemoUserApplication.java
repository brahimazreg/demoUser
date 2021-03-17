package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.dao.UserRepository;
import com.user.model.User;

@SpringBootApplication
public class DemoUserApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * userRepository.save(new User(1,"Brahim","Azreg","brahimaz@hotmail.com"));
		 * userRepository.save(new User(2,"Fatiha","Yaoti","yaoti@gmail.com"));
		 * userRepository.save(new User(3,"Bob","Marley","bob@caramail.com"));
		 * userRepository.save(new User(4,"Sarah","lambert","Sara@yahoo.fr"));
		 */
		
	}

}
