package com.rso.aar.service.fixedpriceproject;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rso.aar.model.FixedPriceProject;
import com.rso.aar.persistence.dao.fixedpriceproject.FixedPriceProjectsDao;

@Component
public class FixedPriceProjectServiceImpl implements FixedPriceProjectService {

	private static final Logger LOGGER = LoggerFactory.getLogger(FixedPriceProjectServiceImpl.class);

	@Autowired
	private FixedPriceProjectsDao fixedPriceProjectDao;

	@Override
	public List<FixedPriceProject> findAllFixedPriceProjects() {
		LOGGER.debug("call findAllFixedPriceProjects");
		return fixedPriceProjectDao.getAllFixedPriceProjects();
	}

	@Override
	public FixedPriceProject saveFixedPriceProject(FixedPriceProject fixedPriceProject) {
		LOGGER.debug("call saveFixedPriceProject");
		return fixedPriceProjectDao.saveFixedPriceProject(fixedPriceProject);
	}

}
