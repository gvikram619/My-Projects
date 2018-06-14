package com.luv2code.employee.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();


		try{
			int empi=1;
			
			session.beginTransaction();
			
			Employee e=session.get(Employee.class, empi);
			
			System.out.println(e);
			
			session.getTransaction().commit();
			
			
			
		}
			
		finally{
			factory.close();
		}
	}

}
