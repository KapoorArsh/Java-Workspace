package other;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class sqlexample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("Hibernate.config.xml").buildSessionFactory();
		Session s = factory.openSession();
		
		//SQl Query
		String q = "Select * from student_details";
		NativeQuery nq = s.createSQLQuery(q);
		List<Object []> list = nq.list();
		for(Object [] s1:list) {
			System.out.println(Arrays.toString(s1));
		}
		s.close();
		factory.close();
	}
}
