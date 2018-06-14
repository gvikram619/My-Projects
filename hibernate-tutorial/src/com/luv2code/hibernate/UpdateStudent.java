package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudent {

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
			
			temp3.setFirstName("kapil");
			
			System.out.println("complete"+temp3);
			
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
			
			session.getTransaction().commit();
			
			
			
			System.out.println("Done");
			
			
			
			
			
			
			
		}
		
		finally{
			factory.close();
		}

	}

}
