package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.learn.model.Student;


public class HQLEx {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		HQL Syntax
//		String hqlQuery="From Student";
//		String hqlQuery="From Student where city='jamshedpur'";
		String hqlQuery="From Student as students where city=:ci and students.certificate.course=:co";
		
		Query q1=s.createQuery(hqlQuery);
		q1.setParameter("ci", "MP");
		q1.setParameter("co", "java");
//		single (unique)
//		multiple-list
		List<Student> list=q1.list();
		for(Student stu:list) {
			System.out.println(stu.getName()+" : "+stu.getCertificate().getCourse());
		}
//		System.out.println("--------------------------------------------------");
//		delete query
//		Query q2=s.createQuery("delete from Student as students where students.city=:delcity");
//		q2.setParameter("delcity","MP");
//		int row=q2.executeUpdate();
//		System.out.println("deleted");
//		System.out.println(row);
		System.out.println("----------------------------------------------------");
//		update query
//		Query q3=s.createQuery("update Student set city=:newcity where name=:n");
//		q3.setParameter("newcity", "Delhi");
//		q3.setParameter("n", "Ram");
//		int row=q3.executeUpdate();
//		System.out.println("updated");
//		System.out.println(row);
		System.out.println("------------------------------------------------------");
//		join query
		Query q4=s.createQuery("select q.question,q.q_id,a.answer from Question as q INNER JOIN q.ans as a");
		List<Object[]> l2=q4.getResultList();
		for(Object[] arr:l2) {
			System.out.println(Arrays.toString(arr));
		}
		t.commit();
		s.close();
		sf.close();
	}
}
