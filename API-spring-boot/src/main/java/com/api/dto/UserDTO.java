package com.api.dto;

import com.api.entities.User;

public class UserDTO {
	private Long id;
	private String name;
	private String password;
	
	public UserDTO() {}
	
	public UserDTO(Long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
		password = user.getPassword();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
