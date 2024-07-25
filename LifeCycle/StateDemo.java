package com.lifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.Certificate;
import com.learn.model.Student;

public class StateDemo {

	public static void main(String[] args) {
	//	Transient
	//	Persistent
	//	Detached
	//	Removed
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		
	//	Creating student object
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Rahul");
		s1.setCity("Bangalore");
		Certificate c1=new Certificate("Java","3 months");
		s1.setCertificate(c1);
	// student is in transient state
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		now it is in persistent state
		s.save(s1);
		s1.setName("Ram");
		t.commit();
//		now it is in detached state
		s.close();
		sf.close();
		
	}

}
