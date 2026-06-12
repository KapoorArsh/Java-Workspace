package other;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate1.annot;

public class pagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("Hibernate.config.xml").buildSessionFactory();
		Session s = factory.openSession();
		Query<annot> query = s.createQuery("from annot ",annot.class);
		
		//implementing pagination
		query.setFirstResult(5);
		query.setMaxResults(10);
		
		List<annot>list=query.list();
		for(annot st:list) {
			System.out.println("ID--> " + st.getDetailsId() + " Name--> " + st.getName() + " Age--> " + st.getAge() + " Date--> " + st.getAddeddate());
		}
		s.close();
		factory.close();
	}
}
