package com.dao;

import com.entity.Permission;

public interface PermissionDao {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
