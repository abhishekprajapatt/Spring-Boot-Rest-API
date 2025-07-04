package com.getuready.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getuready.model.User;
import com.getuready.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> allUsers = userRepository.findAll();
		return allUsers;
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		Optional<User> findByIdUser = userRepository.findById(userId);
		if(findByIdUser.isPresent()) {
			User user = findByIdUser.get();
			userRepository.delete(user);
		}
	}

	@Override
	public User getUserById(Integer userId) {
		Optional<User> findByIdUser = userRepository.findById(userId);
		if(findByIdUser.isPresent()) {
			return findByIdUser.get();
		}
		return null;
	}
}
