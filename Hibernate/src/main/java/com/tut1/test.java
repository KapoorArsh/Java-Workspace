package com.tut1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		System.out.println("Project Started....");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.Config.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		student1 stu = new student1();
		stu.setId(996);
		stu.setName("Noor");
		stu.setCity("Ludhiana");
		
		Certificate cer= new Certificate();
		cer.setCourse("Java devop");
		cer.setDuration("4 months");
		stu.setCerti(cer);
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(stu);
		tx.commit();
		session.close();
		factory.close();
		
	}
}
