package com.revshop.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.revshop.dao.UserRepository;
import com.revshop.model.User;

@Service
public class UserService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void registerUser(User user) {
	    user.setPassword(passwordEncoder.encode(user.getPassword()));
	    user.setRole("ROLE_USER"); // Use ROLE_USER, as Spring Security requires roles to be prefixed with ROLE_
	    userRepository.save(user);
	}

}
