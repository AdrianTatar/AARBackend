package com.rso.aar.service.surchargecustomer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rso.aar.model.SurchargeCustomer;
import com.rso.aar.persistence.dao.surchargecustomer.SurchargeCustomerDao;

@Component
public class SurchargeCustomerServiceImpl implements SurchargeCustomerService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(SurchargeCustomerServiceImpl.class);
	
	@Autowired
	private SurchargeCustomerDao surchargeCustomerDao;
	 
	@Override
	public List<SurchargeCustomer> findAllSurcheargeCustomers(){
		LOGGER.debug("call findAllSurcheargeCustomers");
		return surchargeCustomerDao.findAllSurchargeCustomers();
	}

	@Override
	public SurchargeCustomer saveSurchargeCustomer(SurchargeCustomer surchargeCustomer){
		LOGGER.debug("call saveSurchargeCustomer");
		return surchargeCustomerDao.saveSurchargeCustomer(surchargeCustomer);
	}
	
}
