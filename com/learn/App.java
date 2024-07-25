package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.Certificate;
import com.learn.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        get,load
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	SessionFactory sf=con.buildSessionFactory();
    	Session s=sf.openSession();
//    	Transaction t=s.beginTransaction();
//    	Student s1=new Student();
//    	s1.setName("Pratyush");
//    	s1.setCity("Jamshedpur");
//    	s.save(s1);
//    	Student s2=new Student();
//    	s2.setName("Ram");
//    	s2.setCity("Bangalore");
//    	s.save(s2);
//    	t.commit();
//    	s.close();
//    	Student stu=(Student)s.get(Student.class, 3);
//    	System.out.println(stu);
//    	Student stu1=(Student)s.get(Student.class, 3);
//    	System.out.println(stu1);
//    	System.out.println(stu.hashCode());
//    	System.out.println(stu1.hashCode());
//    	Student st1=(Student)s.load(Student.class, 5);
//    	System.out.println(st1);
    	Student s1=new Student();
    	s1.setId(1);
    	s1.setName("Pratyush");
    	s1.setCity("bangalore");
    	Student s2=new Student();
    	s2.setId(2);
    	s2.setName("Rahul");
    	s2.setCity("jamshedpur");
    	Certificate c1=new Certificate();
    	c1.setCourse("Java");
    	c1.setDuration("6 months");
    	s1.setCertificate(c1);
    	Certificate c2=new Certificate();
    	c2.setCourse("python");
    	c2.setDuration("2 months");
    	s2.setCertificate(c2);
    	Student s3=new Student();
    	s3.setId(3);
    	s3.setName("Riya");
    	s3.setCity("MP");
    	Student s4=new Student();
    	s4.setId(4);
    	s4.setName("Ram");
    	s4.setCity("jamshedpur");
    	Certificate c3=new Certificate();
    	c3.setCourse("Java");
    	c3.setDuration("6 months");
    	s3.setCertificate(c3);
    	Certificate c4=new Certificate();
    	c4.setCourse("Java");
    	c4.setDuration("3 months");
    	s4.setCertificate(c4);
    	Transaction t=s.beginTransaction();
    	s.save(s1);
    	s.save(s2);
    	s.save(s3);
    	s.save(s4);
    	t.commit();
    	s.close();
    	sf.close();
    }
}
