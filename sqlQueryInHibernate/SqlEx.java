package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.learn.model.Student;

public class SqlEx {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
//		SQL Query
		String q="select * from student";
		NativeQuery nq=s.createNativeQuery(q);
		List<Object[]> list=nq.list();
		for(Object[] st:list) {
//			System.out.println(Arrays.toString(st));
			System.out.println(st[4]+" : "+st[2]);
		}
		s.close();
		sf.close();

	}

}
