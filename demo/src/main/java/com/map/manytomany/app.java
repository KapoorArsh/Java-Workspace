package com.map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
	public static void main(String[] args) {
		System.out.println("Project Started.....");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		emp e1 = new emp();
		emp e2 = new emp();
		e1.setEid(12);
		e1.setName("Noor");
		e2.setEid(13);
		e2.setName("Arsh");
		
		project p1 = new project();
		project p2 = new project();
		p1.setPid(1);
		p1.setProjectname("Chatbot using Java");
		p2.setPid(2);
		p2.setProjectname("Chatbot using Python");
		
		List<emp> list1 = new ArrayList<emp>();
		list1.add(e1);
		list1.add(e2);
		 
		List<project> list2 = new ArrayList<project>();
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		e2.setProjects(list2);
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
