package mappingxml;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		SessionFactory fact = new Configuration().configure("Hibernate.config.xml").buildSessionFactory();
		person p = new person(1,"noor","CHD","9872613251");
		Session s = fact.openSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();
		fact.close();
	}
}
