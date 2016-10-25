package com.service;

import com.entity.Permission;

public interface PermissionService {

	public Permission createPermission(Permission permission);

	public void deletePermission(Long permissionId);
}
