package com.map.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App1 {
	public static void main(String[] args) {
		System.out.println("Project Started....");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		Question1 q = new Question1();
//		q.setQuestionId(11);
//		q.setQuestion("Features of Java");
//		
//		Answer1 a = new Answer1();
//		a.setAnswerId(22);
//		a.setAnswer("Platform Indepedent");
//		a.setQuestion(q);
//		
//		Answer1 a1 = new Answer1();
//		a1.setAnswerId(33);
//		a1.setAnswer("OOPS Based");
//		a1.setQuestion(q);
//		
//		Answer1 a2 = new Answer1();
//		a2.setAnswerId(44);
//		a2.setAnswer("it very eazy to learn");
//		a2.setQuestion(q);
//		
//		List<Answer1> list = new ArrayList<Answer1>();
//		list.add(a);
//		list.add(a1);
//		list.add(a2);
//	
//		q.setAnswers(list);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
//		s.save(q);
//		s.save(a);
//		s.save(a1);
//		s.save(a2);
		Question1 q = s.get(Question1.class, 11);
		System.out.println(q);
		tx.commit();
		s.close();
		factory.close();
	}
}
