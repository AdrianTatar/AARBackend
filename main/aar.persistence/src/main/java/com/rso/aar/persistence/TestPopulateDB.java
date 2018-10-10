package com.rso.aar.persistence;

import org.hibernate.Session;

import com.rso.aar.model.FixedPriceProject;
import com.rso.aar.model.SurchargeCustomer;
//import com.rso.aar.persistence.entities.Umlageschluessel;
import com.rso.aar.model.UserAction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TestPopulateDB {

	//private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
//		for (int i = 21; i < 40; i++) {
//			UserAction userAction = new UserAction();
//			userAction.setUserId("user" + i);
//			userAction.setAction("CREATE");
//			LocalDateTime timestamp = LocalDateTime.now();
//			userAction.setTimestamp(timestamp);
//			session.save(userAction);
//		}
		
//		FixedPriceProject bean= new FixedPriceProject();
//		bean.setProjectdescription("Wartung ELBA Business Client");
//		bean.setProjectnumberplanmill("R000004760");
//		bean.setProjectidtagetik("B11290_32_47");
//		bean.setCustomernumber("80020");
//		bean.setPrice(new BigDecimal(477830));
		
//		SurchargeCustomer bean= new SurchargeCustomer();
//		bean.setDebitornumber("80020");
//		bean.setDebitorname("Raiffeisen e-force");
//		bean.setType("Fremdbanken");
//		bean.setCustomernumber("");
//		bean.setCustomername("ERSTE Bank");
		
		SurchargeCustomer bean= new SurchargeCustomer();
		bean.setDebitornumber("19690");
		bean.setDebitorname("Vakif");
		bean.setType("Fremdbanken");
		bean.setCustomernumber("19690");
		bean.setCustomername("Vakif");
		
		session.save(bean);
		
		session.getTransaction().commit();

		session.close();
	}
}
