package com.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<User> getAll(){
		return service.getAll();
	}
	
	
}
