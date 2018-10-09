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

import com.rso.aar.model.SurchargeCustomer;
import com.rso.aar.service.surchargecustomer.SurchargeCustomerService;

@Service
@Scope("singleton")
@Path("/surchargeCustomer")
public class SurchargeCustomerRestService {

	@Autowired
	private SurchargeCustomerService surchargeCustomerService;

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/readAll")
	public List<SurchargeCustomer> getUserActions() {
		return surchargeCustomerService.findAllSurcheargeCustomers();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public SurchargeCustomer createSurchargeCustomer(SurchargeCustomer surchargeCustomer) {
		return surchargeCustomerService.saveSurchargeCustomer(surchargeCustomer);
	}
}
