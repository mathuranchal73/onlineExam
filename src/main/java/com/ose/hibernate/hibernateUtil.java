package com.ose.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ose.hibernate.entity.user;

public class hibernateUtil {

	private static final SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			Configuration configuration=new Configuration();
			configuration.addAnnotatedClass(user.class);
			configuration.configure();
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			System.out.println("Hibernate Successfully Configured");
			return sessionFactory;
			
		}catch(Throwable throwable) {
			throw new ExceptionInInitializerError(throwable);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
