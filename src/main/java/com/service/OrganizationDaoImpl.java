package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrganizationDao;
import com.entity.Organization;

@Service("organizationService")
@Transactional
public class OrganizationDaoImpl implements OrganizationDao {

	@Autowired
	private OrganizationDao organizationDao;
	
	public Organization createOrganization(Organization organization) {
		return organizationDao.createOrganization(organization);
	}

	public Organization updateOrganization(Organization organization) {
		return organizationDao.updateOrganization(organization);
	}

	public void deleteOrganization(Long organizationId) {
		organizationDao.deleteOrganization(organizationId);
	}

	public Organization findOne(Long organizationId) {
		return organizationDao.findOne(organizationId);
	}

	public List<Organization> findAll() {
		return organizationDao.findAll();
	}

	public List<Organization> findAllWithExclude(
			Organization excludeOrganization) {
		return organizationDao.findAllWithExclude(excludeOrganization);
	}

	public void move(Organization source, Organization target) {
		organizationDao.move(source, target);
	}

}
