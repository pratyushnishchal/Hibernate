package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingMain {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		// Creating question 1
		Question q1 = new Question();
		q1.setQ_id(1);
		q1.setQuestion("What is java");
		// Creating answer 1
		Answer a1 = new Answer();
		a1.setA_id(2);
		a1.setAnswer("Java is a programming language");
		a1.setQ(q1);
		q1.setAnswer(a1);
		// Creating question 2
		Question q2 = new Question();
		q2.setQ_id(20);
		q2.setQuestion("What is JPA");
		// Creating answer 2
		Answer a2 = new Answer();
		a2.setA_id(24);
		a2.setAnswer("JPA is a java percistence API");
		a2.setQ(q2);
		q2.setAnswer(a2);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		t.commit();
//		fetching
		Question qs=(Question)s.get(Question.class, 1);
		System.out.println(qs.getQuestion());
		System.out.println(qs.getAnswer().getAnswer());
		s.close();
		sf.close();
	}

}
