package com.service;

import java.util.List;
import java.util.Set;

import com.entity.Resource;

public interface ResourceService {

	public Resource createResource(Resource resource);
	public Resource updateResource(Resource resource);
	public void deleteResource(long resourceId);
	Resource findOne(Long resourceId);
	List<Resource> findAll();
	Set<String> findPermissions(Set<Long> resourceIds);
	List<Resource> findMenus(Set<String> permissions);
}
