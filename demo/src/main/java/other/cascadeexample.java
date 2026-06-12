package other;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.map.onetomany.*;
public class cascadeexample {
	public static void main(String[] args) {
		System.out.println("Project Started....");
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Question1 q = new Question1();
		q.setQuestionId(20);
		q.setQuestion("What is swing?");
		
		Answer1 a1 = new Answer1(222,"It is eazy",q);
		Answer1 a2 = new Answer1(333,"It is very eazy",q);
		Answer1 a3 = new Answer1(444,"It is bery very eazy",q);
		
		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q.setAnswers(list);
		Transaction tx = s.beginTransaction();
		s.save(q);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
