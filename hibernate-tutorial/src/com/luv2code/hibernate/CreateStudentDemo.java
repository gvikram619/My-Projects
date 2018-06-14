package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration()
		                       .configure("hibernate.cfg.xml")
		                       .addAnnotatedClass(Student.class)
		                       .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try{
			Student tempStudent=new Student("vikram","G","gavi@gmail.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		}
		
		finally{
			factory.close();
		}

	}

}
