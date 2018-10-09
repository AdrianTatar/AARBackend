package com.rso.aar.persistence.dao.useraction;

import java.util.List;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.rso.aar.model.UserAction;
import com.rso.aar.persistence.dao.HibernateDao;

@Component
public class UserActionDaoHibernate extends HibernateDao<UserAction, Serializable> implements UserActionDao {

	@Override
	public List<UserAction> getAllUserActions() {
		return findAll();
	}

	@Override
	public UserAction saveUserAction(UserAction userAction) {
		return persist(userAction);
	}
}
