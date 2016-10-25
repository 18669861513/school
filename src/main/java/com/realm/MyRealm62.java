package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;

public class MyRealm62 implements Realm {

	public String getName() {
		return "b";
	}

	public boolean supports(AuthenticationToken token) {
		return false;
	}

	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token)
			throws AuthenticationException {
		return new SimpleAuthenticationInfo("zhang", "123", getName());
	}

}
