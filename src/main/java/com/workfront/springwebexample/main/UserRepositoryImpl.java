package com.workfront.springwebexample.main;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository{
	@Override
	public User getbyId(String id) {
		User user = new User();
		user.setId(id);
		user.setName("Gago");
		return user;
	}
}
