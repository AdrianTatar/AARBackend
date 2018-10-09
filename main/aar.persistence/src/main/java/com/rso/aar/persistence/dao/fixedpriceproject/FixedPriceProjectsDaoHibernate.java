package com.rso.aar.persistence.dao.fixedpriceproject;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rso.aar.model.FixedPriceProject;
import com.rso.aar.persistence.dao.HibernateDao;

@Component
public class FixedPriceProjectsDaoHibernate extends HibernateDao<FixedPriceProject, Serializable>
		implements FixedPriceProjectsDao {

	@Override
	public List<FixedPriceProject> getAllFixedPriceProjects() {
		return findAll();
	}

	@Override
	public FixedPriceProject saveFixedPriceProject(FixedPriceProject fixedPriceProject) {
		return persist(fixedPriceProject);
	}

}
