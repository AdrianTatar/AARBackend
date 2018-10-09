package com.rso.aar.persistence.dao.surchargecustomer;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rso.aar.model.SurchargeCustomer;
import com.rso.aar.persistence.dao.HibernateDao;

@Component
public class SurchargeCustomerDaoHibernate extends HibernateDao<SurchargeCustomer, Serializable>
		implements SurchargeCustomerDao {

	@Override
	public List<SurchargeCustomer> findAllSurchargeCustomers() {
		return findAll();
	}

	@Override
	public SurchargeCustomer saveSurchargeCustomer(SurchargeCustomer surchargeCustomer) {
		return persist(surchargeCustomer);
	}
}
