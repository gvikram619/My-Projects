package com.luv2code.employee.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();


		try{
			int empi=1;
			
			session.beginTransaction();
			
			List<Employee> e=session.createQuery("from Employee s where company='TCS'").list();
			
			for(Employee r: e)
			{
				System.out.println(r);
			}
			
			
			
			session.getTransaction().commit();
			
			
			
		}
			
		finally{
			factory.close();
		}
	}

}
