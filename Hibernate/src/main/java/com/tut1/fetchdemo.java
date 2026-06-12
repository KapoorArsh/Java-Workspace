package com.tut1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchdemo {
	public static void main(String[] args) {
		System.out.println("Project Started....");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.Config.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		student1 student=(student1)session.get(student1.class,996);
		System.out.println(student);
	}
}
