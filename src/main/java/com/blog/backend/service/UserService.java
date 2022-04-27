package com.blog.backend.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.blog.backend.dto.UserRegistrationDto;
import com.blog.backend.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
	List<User> getAll();
	
}