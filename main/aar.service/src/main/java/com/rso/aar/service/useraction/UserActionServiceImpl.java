package com.rso.aar.service.useraction;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rso.aar.model.UserAction;
import com.rso.aar.persistence.dao.useraction.UserActionDao;

@Component
public class UserActionServiceImpl implements UserActionService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserActionServiceImpl.class);
	
	@Autowired
	private UserActionDao userActionDao;
	

	@Override
	public List<UserAction> findAllUserActions(){
		LOGGER.debug("call getAllUserActions");
		return userActionDao.getAllUserActions();
	}
	
	@Override
	public UserAction saveUserAction(UserAction userActionParam) {
		LOGGER.debug("call saveUserAction");
		return userActionDao.saveUserAction(userActionParam);				
	}

}
