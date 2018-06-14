package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration()
		                       .configure("hibernate.cfg.xml")
		                       .addAnnotatedClass(Student.class)
		                       .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		int stdid=3;
		try{
			
			
			session.beginTransaction();
			
			
			
			Student temp3=session.get(Student.class,stdid);
			
			session.delete(temp3);
			
			
			
			session.createQuery("delete from Student where id='4'").executeUpdate();
			
			
			session.getTransaction().commit();
			
			
			
			System.out.println("Done");
			
			
			
			
			
			
			
		}
		
		finally{
			factory.close();
		}

	}

}
