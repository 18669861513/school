package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.entity.Role;
import com.utils.JdbcTemplateUtils;

public class RoleDaoImpl implements RoleDao {

	private JdbcTemplate jdbcTemplate = JdbcTemplateUtils.jdbcTemplate();

	public Role createRole(final Role role) {
		final String sql = "insert into sys_role(role,description,resource_ids,available) values(?,?,?,?)";
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(
					Connection connection) throws SQLException {
				PreparedStatement psst = connection.prepareStatement(sql,
						new String[] { "id" });
				int count = 1;
				psst.setString(count++, role.getRole());
				psst.setString(count++, role.getDescription());
				psst.setString(count++, role.getResourceIdsStr());
				psst.setBoolean(count++, role.getAvailable());
				return psst;
			}
		}, keyHolder);
		role.setId(keyHolder.getKey().longValue());
		return role;
	}

	public Role updateRole(Role role) {
		String sql = "update sys_role set role=?,description=?,resource_ids=?,available=? where id=?";
		jdbcTemplate.update(sql, role.getRole(), role.getDescription(),
				role.getResourceIds(), role.getAvailable(), role.getId());
		return null;
	}

	public void deleteRole(Long roleId) {
		String sql = "delete from sys_role where id = ?";
		jdbcTemplate.update(sql, roleId);
	}

	public Role findOne(Long roleId) {
		String sql = "select id, role, description, resource_ids, available from sys_role where id = ?";
		List<Role> roleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Role.class), roleId);
		if(roleList.size() == 0)
			return null;
		return roleList.get(0);
	}

	public List<Role> findAll() {
		String sql = "select id, role, description, resource_ids, available from sys_role";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Role.class));
	}

}
