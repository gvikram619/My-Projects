package com.luv2code.employee.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.employee.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		
Session session=factory.getCurrentSession();


try{
	Employee emp= new Employee("vikram","G","TCS");
	
	session.beginTransaction();
	
	session.save(emp);
	
	session.getTransaction().commit();
	
	
	
}
	
finally{
	factory.close();
}
	}

}
