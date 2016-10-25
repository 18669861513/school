package com.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

public class User implements Serializable {

	private Long id;// 编号
	private Long organiazationId;// 所属公司
	private String username;// 用户名
	private String password;// 密码
	private String salt;// 加密密码的盐
	private List<Long> roleIds;// 拥有的角色列表
	private Boolean locked = Boolean.FALSE;

	public User() {

	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getCredentialsSalt() {
		return username + salt;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		if (id != null ? !id.equals(user.id) : user.id != null)
			return false;
		return true;
	}

	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	public String toString() {
		return "User{" + "id=" + id + ",organizationId=" + organiazationId
				+ ",username='" + username + "'" + ",password='" + password
				+ "'" + ",salt='" + salt + "'" + ",roleIds=" + roleIds
				+ ",locked=" + locked + "}";
	}

	public Long getOrganiazationId() {
		return organiazationId;
	}

	public void setOrganiazationId(Long organiazationId) {
		this.organiazationId = organiazationId;
	}

	public List<Long> getRoleIds() {
		if (roleIds == null) {
			roleIds = new ArrayList<Long>();
		}
		return roleIds;
	}

	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleIdsStr() {
		if (CollectionUtils.isEmpty(roleIds))
			return "";
		StringBuffer s = new StringBuffer();
		for (Long roleId : roleIds) {
			s.append(roleId);
			s.append(",");
		}
		return s.toString();
	}

	public void setRoleIdsStr(String roleIdsStr) {
		if (StringUtils.isEmpty(roleIdsStr))
			return;
		String[] roleIdStrs = roleIdsStr.split(",");
		for (String roleIdStr : roleIdStrs) {
			if (StringUtils.isEmpty(roleIdStr))
				continue;
			getRoleIds().add(Long.parseLong(roleIdStr));
		}
	}
}
