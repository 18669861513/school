package com.service;

import java.util.List;
import java.util.Set;

import com.entity.User;

public interface UserService {

	public User createUser(User user);
	public User updateUser(User user);
	public void deleteUser(Long userId);
	public void changePassword(long userId, String password);
	User findOne(Long userId);
	List<User> findAll();
	public User findByUsername(String username);
	public Set<String> findRoles(String username);
	public Set<String> findPermissions(String username);
}
