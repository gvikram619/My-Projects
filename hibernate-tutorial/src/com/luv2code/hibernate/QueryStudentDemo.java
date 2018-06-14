package com.luv2code.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration()
		                       .configure("hibernate.cfg.xml")
		                       .addAnnotatedClass(Student.class)
		                       .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try{
			
			
			session.beginTransaction();
			
			List<Student> stdlst=session.createQuery("from Student").list();
			
			for(Student std: stdlst)
			{
				System.out.println(std);
			}
			
			stdlst=session.createQuery("from Student s where s.lastName='sharma'").list();
			
			for(Student std: stdlst)
			{
				System.out.println(std);
			}
			stdlst=session.createQuery("from Student s where"
					                   + " s.lastName='sharma' OR s.firstName='ram'").list();
			for(Student std: stdlst)
			{
				System.out.println(std);
			}
			
			stdlst=session.createQuery("from Student s where s.email LIKE '%ma@gmail.com'").list();
			
			for(Student std: stdlst)
			{
				System.out.println(std);
			}
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		}
		
		finally{
			factory.close();
		}

	}

}
