package com.fetchtype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FetchTypeMain {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		// Creating question 1
//		Question q1 = new Question();
//		q1.setQ_id(1);
//		q1.setQuestion("What is java");
		// Creating answer 1
//		Answer a1 = new Answer();
//		a1.setA_id(2);
//		a1.setAnswer("Java is a programming language");
//		a1.setQ(q1);
		// Creating answer 2
//		Answer a2 = new Answer();
//		a2.setA_id(3);
//		a2.setAnswer("With the help of java we can create softwares");
//		a2.setQ(q1);
		// Creating answer 3
//		Answer a3 = new Answer();
//		a3.setA_id(4);
//		a3.setAnswer("Java has different types of framework");
//		a3.setQ(q1);
//		List<Answer> al=new ArrayList<>();
//		al.add(a1);
//		al.add(a2);
//		al.add(a3);
//		q1.setAns(al);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
//		t.commit();
		Question q=(Question)s.get(Question.class, 1);
		System.out.println(q.getQ_id());
		System.out.println(q.getQuestion());
//		Lazy
//		System.out.println(q.getAns().size());
		System.out.println(q.getAns().size());
//		for(Answer a:q.getAns()) {
//			System.out.println(a.getAnswer());
//		}
//		fetching
//		Question qs = (Question) s.get(Question.class, 1);
//		System.out.println(qs.getQuestion());
//		System.out.println(qs.getAnswer().getAnswer());
//		s.close();
//		sf.close();

	}

}
