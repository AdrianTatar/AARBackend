package com.rso.aar.persistence.dao.surchargecustomer;

import java.util.List;

import com.rso.aar.model.SurchargeCustomer;

public interface SurchargeCustomerDao {
	
	public List<SurchargeCustomer> findAllSurchargeCustomers();
	
	public SurchargeCustomer saveSurchargeCustomer(SurchargeCustomer surchargeCustomer);

}
