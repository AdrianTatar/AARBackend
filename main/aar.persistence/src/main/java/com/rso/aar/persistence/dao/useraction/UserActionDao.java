package com.rso.aar.persistence.dao.useraction;

import java.util.List;

import com.rso.aar.model.UserAction;

public interface UserActionDao {

	public List<UserAction> getAllUserActions();

	public UserAction saveUserAction(UserAction userAction);
}
