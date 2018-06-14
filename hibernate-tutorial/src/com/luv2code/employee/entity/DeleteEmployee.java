package com.luv2code.employee.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();


		try{
			
			
			session.beginTransaction();
			
			session.createQuery("delete from Employee where EmployeeId='1'").executeUpdate();
			
			
			
			
			
			session.getTransaction().commit();
			
			
			
		}
			
		finally{
			factory.close();
		}
	}

}
