package com.service;

import java.util.List;
import java.util.Set;

import com.entity.Role;

public interface RoleService {

	public Role createRole(Role role);
	
	public Role updateRole(Role role);

	public void deleteRole(Long roleId);

	public Role findOne(Long roleId);
	
	public List<Role> findAll();
	
	Set<String> findRoles(Long...roleIds);
	
	Set<String> findPermissions(Long...roleIds);
}
