package com.service;

import com.dao.PermissionDao;
import com.dao.PermissionDaoImpl;
import com.entity.Permission;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao = new PermissionDaoImpl();
	
	public Permission createPermission(Permission permission) {
		return permissionDao.createPermission(permission);
	}

	public void deletePermission(Long permissionId) {
		permissionDao.deletePermission(permissionId);
	}

}
