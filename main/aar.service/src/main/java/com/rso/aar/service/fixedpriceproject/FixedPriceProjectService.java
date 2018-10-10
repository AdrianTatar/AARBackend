package com.rso.aar.service.fixedpriceproject;

import java.util.List;

import com.rso.aar.model.FixedPriceProject;

public interface FixedPriceProjectService {

	public List<FixedPriceProject> findAllFixedPriceProjects();

	public FixedPriceProject saveFixedPriceProject(FixedPriceProject fixedPriceProject);
	
	public FixedPriceProject updateFixedPriceProject(FixedPriceProject fixedPriceProject);

}
