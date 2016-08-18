package com.workfront.springwebexample.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getById(String id) {
		return userRepository.getbyId(id);
	}
}
