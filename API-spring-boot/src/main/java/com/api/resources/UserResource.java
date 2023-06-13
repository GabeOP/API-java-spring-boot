package com.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.User;
import com.api.services.UserService;

import jakarta.annotation.Resource;

@Resource
@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> getAll(){
		List<User> list = service.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@PostMapping
	public ResponseEntity<User> postUser(@RequestBody User obj) {
		service.postUser(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(obj);
	}
}
