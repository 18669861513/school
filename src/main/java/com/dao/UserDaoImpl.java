package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.entity.User;
import com.utils.JdbcTemplateUtils;

public class UserDaoImpl implements UserDao {

	JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

	public User createUser(final User user) {
		final String sql = "insert into sys_user(organization_id,username,password,salt,role_ids,locked) values(?,?,?,?,?,?)";
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql,
						new String[] { "id" });
				int count = 1;
				ps.setLong(count++, user.getOrganiazationId());
				ps.setString(count++, user.getUsername());
				ps.setString(count++, user.getPassword());
				ps.setString(count++, user.getSalt());
				ps.setString(count++, user.getRoleIdsStr());
				ps.setBoolean(count++, user.getLocked());
				return null;
			}
		}, keyHolder);
		user.setId(keyHolder.getKey().longValue());
		return user;
	}

	public User updateUser(User user) {
		String sql = "update sys_user set organization_id=?,username=?,password=?,salt=?,role_ids=?,locked=? where id=?";
		jdbcTemplate.update(sql, user.getOrganiazationId(), user.getUsername(),
				user.getPassword(), user.getSalt(), user.getRoleIdsStr(),
				user.getLocked(), user.getId());
		return user;
	}

	public void delete(Long userId) {
		String sql = "delete from sys_user where id = ?";
		jdbcTemplate.update(sql, userId);
	}

	public User findOne(long userId) {
		String sql = "select id,organization_id,username,password,salt,role_ids as roleIdsStr,locked from sys_user where id=?";
		List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class), userId);
		if(userList.size() == 0)
			return null;
		return userList.get(0);
	}

	public List<User> findAll() {
		String sql = "select id,organization_id,username,password,salt,role_ids as roleIdsStr,locked from sys_user";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
	}

	public User findByUsername(String username) {
		String sql = "select id,organization_id,username,password,salt,role_ids as roleIdsStr,locked from sys_user where username=?";
		List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class), username);
		if(userList.size() == 0)
			return null;
		return userList.get(0);
	}

}
