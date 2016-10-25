package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDao {

	public User createUser(User user);

	public User updateUser(User user);

	public void delete(Long userId);

	User findOne(long userId);

	List<User> findAll();
	
	User findByUsername(String username);
}
