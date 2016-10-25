package com.permissionResolver;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermission;

import com.permission.BitPermission;

public class BitAndWildPermissionResolver implements PermissionResolver {

	public Permission resolvePermission(String permissionString) {
		if(permissionString.startsWith("+"))
			return new BitPermission(permissionString);
		return new WildcardPermission(permissionString);
	}

}
