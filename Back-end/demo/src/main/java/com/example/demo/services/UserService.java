package com.example.demo.services;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	
	UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}

	public List<User> getAllUsers() {
	
		return userRepository.findAll();
	}

	public User saveOneUser(User newUser) {
	
		return userRepository.save(newUser);
	}

	public User getOneUserById(Long userId) {
		
		return userRepository.findById(userId).orElse(null);
	}

	public User updateOneUser(Long userId, User newUser) {
		
		Object user=userRepository.findById(userId);
		if(((java.util.Optional<User>) user).isPresent())
		{
			User foundUser=(User) ((Optional) user).get();
			foundUser.setUserName(newUser.getUserName());
			foundUser.setPassword(newUser.getPassword());
			userRepository.save(foundUser);
			return foundUser;
		
		}
		else
		{
			return null;
		}
	}

	public void deleteById(Long userId) {
	
		userRepository.deleteById(userId);
		
	}
}
