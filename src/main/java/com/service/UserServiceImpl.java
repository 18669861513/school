package com.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;
import com.utils.PasswordHelper;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private PasswordHelper passwordHelper;
	@Autowired
	private RoleService roleService;
	
	public User createUser(User user) {
		passwordHelper.encryptPassword(user);
		return userDao.createUser(user);
	}

	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	public void deleteUser(Long userId) {
		userDao.delete(userId);
	}

	public void changePassword(long userId, String password) {
		User user = userDao.findOne(userId);
		user.setPassword(password);
		passwordHelper.encryptPassword(user);
		userDao.updateUser(user);
	}

	public User findOne(Long userId) {
		return userDao.findOne(userId);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	public Set<String> findRoles(String username) {
		User user = findByUsername(username);
		if(user == null)
			return Collections.EMPTY_SET;
		return roleService.findRoles(user.getRoleIds().toArray(new Long[0]));
	}

	public Set<String> findPermissions(String username) {
		User user = findByUsername(username);
		if(user == null)
			return Collections.EMPTY_SET;
		return roleService.findPermissions(user.getRoleIds().toArray(new Long[0]));
	}

}
