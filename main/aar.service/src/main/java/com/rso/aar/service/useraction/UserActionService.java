package com.rso.aar.service.useraction;

import java.util.List;

import com.rso.aar.model.UserAction;

public interface UserActionService {

	public List<UserAction> findAllUserActions();
	
	public UserAction saveUserAction(UserAction userAction);	
}
