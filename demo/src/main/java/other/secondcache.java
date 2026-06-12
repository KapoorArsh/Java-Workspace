package other;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate1.annot;

public class secondcache {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("Hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        //first 
        annot stu = session.get(annot.class, 11);
        System.out.println(stu);
        session.close();
        
        //second
        Session session1 = factory.openSession();
        annot stu1 = session1.get(annot.class, 11);
        System.out.println(stu1);
        session1.close();
        
        factory.close();
	}
}
