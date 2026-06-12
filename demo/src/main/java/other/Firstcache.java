package other;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate1.annot;
public class Firstcache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("Hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        annot student = session.get(annot.class, 12);
        System.out.println(student);
        
        System.out.println("Working something");
        annot student1 = session.get(annot.class, 12);
        System.out.println(student1);
        
        System.out.println(session.contains(student1));
        session.close();
        
	}
}
