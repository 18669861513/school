package com.taglib;

import java.util.Collection;

import org.springframework.util.CollectionUtils;

import com.entity.Organization;
import com.entity.Resource;
import com.entity.Role;
import com.service.OrganizationService;
import com.service.ResourceService;
import com.service.RoleService;
import com.utils.SpringUtils;

public class Function {

	private static OrganizationService organizationService;
	private static RoleService roleService;
	private static ResourceService resourceService;

	public static boolean in(Iterable iterable, Object element) {
		if (iterable == null)
			return false;
		return CollectionUtils.contains(iterable.iterator(), element);
	}

	public static String organizationName(Long organizationId) {
		Organization organization = getOrganizationService().findOne(
				organizationId);
		if (organization == null)
			return "";
		return organization.getName();
	}

	public static String organizationNames(Collection<Long> organizationIds) {
		if (CollectionUtils.isEmpty(organizationIds))
			return "";
		StringBuilder s = new StringBuilder();
		for (Long organizationId : organizationIds) {
			Organization organization = getOrganizationService().findOne(
					organizationId);
			if (organization == null)
				return "";
			s.append(organization.getName());
			s.append(",");
		}
		if (s.length() > 0)
			s.deleteCharAt(s.length() - 1);
		return s.toString();
	}

	public static String roleName(Long roleId) {
		Role role = getRoleService().findOne(roleId);
		if (role == null)
			return "";
		return role.getDescription();
	}

	public static String roleNames(Collection<Long> roleIds) {
		if (CollectionUtils.isEmpty(roleIds))
			return "";
		StringBuilder s = new StringBuilder();
		for (Long roleId : roleIds) {
			Role role = getRoleService().findOne(roleId);
			if (role == null)
				return "";
			s.append(role.getDescription());
			s.append(",");
		}
		if (s.length() > 0)
			s.deleteCharAt(s.length() - 1);
		return s.toString();
	}

	public static String getResourceName(Long resourceId) {
		Resource resource = getResourceService().findOne(resourceId);
		if (resource == null)
			return "";
		return resource.getName();
	}
	
	public static String getResourceNames(Collection<Long> resourceIds){
		if(CollectionUtils.isEmpty(resourceIds))
			return "";
		StringBuilder s = new StringBuilder();
		for (Long resourceId : resourceIds) {
			Resource resource = getResourceService().findOne(resourceId);
			if(resource == null)
				return "";
			s.append(resource.getName());
			s.append(",");
		}
		s.deleteCharAt(s.length()-1);
		return s.toString();
	}

	public static OrganizationService getOrganizationService() {
		if(organizationService == null)
			organizationService = SpringUtils.getBean(OrganizationService.class);
		return organizationService;
	}

	public static RoleService getRoleService() {
		if(roleService == null)
			roleService = SpringUtils.getBean(RoleService.class);
		return roleService;
	}

	public static ResourceService getResourceService() {
		if(resourceService == null)
			resourceService = SpringUtils.getBean(ResourceService.class);
		return resourceService;
	}

}
