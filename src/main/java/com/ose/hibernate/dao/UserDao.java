package com.ose.hibernate.dao;

import com.ose.hibernate.entity.user;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ose.hibernate.*;

public class UserDao {

	public void saveUser(user user) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.saveOrUpdate(user);
			
		}
		catch(HibernateException exc) {
			tx.rollback();
			exc.printStackTrace();
		}
		finally {
			tx.commit();
			session.close();
		}
		
	}
	
	public void deleteUser(user user) {
		Session session=hibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.delete(user);
		}catch(HibernateException exc) {
			tx.rollback();
			exc.printStackTrace();
		}
		finally {
			tx.commit();
			session.close();
		}
	}
}
