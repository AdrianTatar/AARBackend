package com.rso.aar.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.rso.aar.model.FixedPriceProject;
import com.rso.aar.model.SurchargeCustomer;
import com.rso.aar.model.UserAction;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();

			configuration.addAnnotatedClass(UserAction.class);
			configuration.addAnnotatedClass(FixedPriceProject.class);
			configuration.addAnnotatedClass(SurchargeCustomer.class);

			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
