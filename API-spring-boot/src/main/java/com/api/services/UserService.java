package com.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.entities.User;
import com.api.repositories.UserRepository;

@Service
public class UserService {


	UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> getAll(){
		return repository.findAll();
	}
}
