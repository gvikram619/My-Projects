package com.luv2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration()
		                       .configure("hibernate.cfg.xml")
		                       .addAnnotatedClass(Student.class)
		                       .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try{
			Student temp2=new Student("sham","surgeon","shama@gmail.com");
			
			session.beginTransaction();
			
			session.save(temp2);
			
			session.getTransaction().commit();
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			Student temp3=session.get(Student.class,temp2.getId());
			
			System.out.println("complete"+temp3);
			session.getTransaction().commit();
			
			
			
			System.out.println("Done");
			
			
			
			
			
			
			
		}
		
		finally{
			factory.close();
		}

	}

}
