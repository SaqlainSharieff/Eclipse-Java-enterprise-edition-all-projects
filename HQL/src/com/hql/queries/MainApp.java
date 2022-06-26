package com.hql.queries;

import org.hibernate.Session;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session objsession=HibernateDBConnect.getSessionFactory().openSession();
		
		try 
		{
			objsession.beginTransaction();
			
			objsession.createQuery("delete users where fname='asus' ").executeUpdate();
			
			
		} 
		finally
		{
			objsession.close();
			
		}
	}
}
