package com.api.services;

import java.util.List;
import java.util.Optional;

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
	
	public User getById(Long id) {
		User entity = repository.findById(id).get();
		return entity;
	}
	
	public User postUser(User obj) {
		return repository.save(obj);
	}
	
	public User updateUser(Long id, User obj) {
		Optional<User> entity = repository.findById(id);
		var userModel = entity.get();
		
		return repository.save(userModel);
	}

	
	public void deleteUser(Long id) {
		repository.deleteById(id);
	}
}
