package com.map;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started.....");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Question q = new Question();
		q.setQuestionID(1);
		q.setQuestion("What is ORM?");
		
		Answer ans = new Answer();
		ans.setAnswerId(3);
		ans.setAnswer("Object Related Mapping");
		q.setAnswer(ans);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q);
		s.save(ans);
		tx.commit();
		s.close();
		factory.close();
	}
}
