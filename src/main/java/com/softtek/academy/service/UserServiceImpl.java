package com.softtek.academy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.domain.UserEntity;
import com.softtek.academy.repository.UserRepository;

/**
 *         Service to obtaining users to User table
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	/**
	 * Method to get all users
	 */

	@Override
	public List<UserEntity> list() {
		return userRepository.findAll(); 
	}

	/**
	 * Method to find one user by username
	 */

	@Override
	public UserEntity findByUsername(String username) {
		return null;
	}

}
