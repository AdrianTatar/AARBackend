package com.rso.aar.service.surchargecustomer;

import java.util.List;

import com.rso.aar.model.SurchargeCustomer;

public interface SurchargeCustomerService {

	public List<SurchargeCustomer> findAllSurcheargeCustomers();

	public SurchargeCustomer saveSurchargeCustomer(SurchargeCustomer surchargeCustomer);

}
