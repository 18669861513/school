package com.realm;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.service.UserService;

public class MyCashRealm extends CasRealm {

	private UserService userService;
	
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals){
		 String username = (String)principals.getPrimaryPrincipal();  
		 SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();  
		 authorizationInfo.setRoles(userService.findRoles(username));  
		 authorizationInfo.setStringPermissions(userService.findPermissions(username));  
		 return authorizationInfo;  

	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
