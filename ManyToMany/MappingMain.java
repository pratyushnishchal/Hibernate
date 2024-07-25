package com.mapping2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
//		Creating Emp 1 object and setting values to it
		Emp e1=new Emp();
		e1.setEid(101);
		e1.setName("Ram");
//		Creating Emp 2 object and setting values to it
		Emp e2=new Emp();
		e2.setEid(102);
		e2.setName("shyam");
//		Creating Project 1 object and setting values to it
		Project p1=new Project();
		p1.setId(1);
		p1.setProjectName("E-commerce project");
//		Creating Project 2 object and setting values to it
		Project p2=new Project();
		p2.setId(2);
		p2.setProjectName("Library Management System");
		List<Emp> l1=new ArrayList<Emp>();
		List<Project> l2=new ArrayList<Project>();
//		Adding emp to the list(l1)
		l1.add(e1);
		l1.add(e2);
//		Adding projects to the list(l2)
		l2.add(p1);
		l2.add(p2);

		e1.setProject(l2);
		p2.setEmps(l1);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		t.commit();
		sf.close();

	}

}
