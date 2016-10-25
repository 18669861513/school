package com.service;

import java.util.List;

import com.entity.Organization;

public interface OrganizationService {

	public Organization createOrganization(Organization organization);
	public Organization updateOrganization(Organization organization);
	public void deleteOrganization(Long organizationId);
	Organization findOne(Long organizationId);
	List<Organization> findAll();
	Object findAllWithExclude(Organization excludeOrganization);
	void move(Organization source, Organization target);
}
