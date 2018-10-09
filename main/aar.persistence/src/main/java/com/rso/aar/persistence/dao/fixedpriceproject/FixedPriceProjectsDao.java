package com.rso.aar.persistence.dao.fixedpriceproject;

import java.util.List;

import com.rso.aar.model.FixedPriceProject;

public interface FixedPriceProjectsDao {

	public List<FixedPriceProject> getAllFixedPriceProjects();

	public FixedPriceProject saveFixedPriceProject(FixedPriceProject fixedPriceProject);
}
