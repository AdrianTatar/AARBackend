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

import com.rso.aar.model.UserAction;
import com.rso.aar.service.useraction.UserActionService;

@Service
@Scope("singleton")
@Path("/userAction")
public class UserActionRestService {

	@Autowired
	private UserActionService userActionService;

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/readAll")
	public List<UserAction> getUserActions() {
		return userActionService.findAllUserActions();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public UserAction createUserAction(UserAction userAction) {
		return userActionService.saveUserAction(userAction);
	}

}
