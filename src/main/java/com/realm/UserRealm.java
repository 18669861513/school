package com.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.service.UserService;

public class UserRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	/**
	 * 授权 Title: doGetAuthorizationInfo Author:lily_xue Description:
	 * 
	 * @param principals
	 * @return
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(userService.findRoles(username));
		authorizationInfo.setStringPermissions(userService
				.findPermissions(username));
		return authorizationInfo;
	}

	/**
	 * 认证 Title: doGetAuthenticationInfo Author:lily_xue Description:
	 * 
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		User user = userService.findByUsername(username);
		if (user == null)
			throw new UnknownAccountException();//没找到账号
		if (Boolean.TRUE.equals(user.getLocked()))
			throw new LockedAccountException();//账号锁定
		// 交给AuthenticationRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或者自己实现
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
				user.getUsername(), user.getPassword(),
				ByteSource.Util.bytes(user.getCredentialsSalt()), getName());
		return simpleAuthenticationInfo;
	}
	
	public void clearCachedAuthorizationInfo(PrincipalCollection principals){
		super.clearCachedAuthorizationInfo(principals);
	}
	
	public void clearCachedAuthenticationInfo(PrincipalCollection principals){
		super.clearCachedAuthenticationInfo(principals);
	}
	
	public void clearCache(PrincipalCollection principals){
		super.clearCache(principals);
	}
	
	public void clearAllCachedAuthorizationInfo(){
		getAuthenticationCache().clear();
	}
	
	public void clearAllCachedAuthenticationInfo(){
		getAuthenticationCache().clear();
	}
	
	public void clearAllCache(){
		clearAllCachedAuthenticationInfo();
		clearAllCachedAuthorizationInfo();
	}
}
