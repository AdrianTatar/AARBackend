package com.rso.aar.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rso.aar.model.FixedPriceProject;
import com.rso.aar.service.fixedpriceproject.FixedPriceProjectService;

@Service
@Scope("singleton")
@Path("/fixedPriceProject")
public class FixedPriceProjectRestService {

	@Autowired
	private FixedPriceProjectService fixedPriceProjectService;

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/readAll")
	public List<FixedPriceProject> getFixedPriceProjects() {
		return fixedPriceProjectService.findAllFixedPriceProjects();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public FixedPriceProject createFixedPriceProject(FixedPriceProject fixedPriceProject) {
		return fixedPriceProjectService.saveFixedPriceProject(fixedPriceProject);
	}

}
