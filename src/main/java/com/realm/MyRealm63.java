package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;

import com.entity.User;

public class MyRealm63 implements Realm {

	public String getName() {
		return "c";
	}

	public boolean supports(AuthenticationToken token) {
		return false;
	}

	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		User user = new User("zhang", "123");
		return new SimpleAuthenticationInfo(user, "123", getName());
	}

}
