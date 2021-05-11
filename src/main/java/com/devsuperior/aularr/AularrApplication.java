package com.devsuperior.aularr;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aularr.entities.User;
import com.devsuperior.aularr.repositories.UserRepository;

@SpringBootApplication
public class AularrApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AularrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria");
		User u2 = new User(null, "Joao");
		User u3 = new User(null, "Bob");
		User u4 = new User(null, "Ana");
		User u5 = new User(null, "Claudia");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
	}
}
