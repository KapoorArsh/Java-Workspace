package Hql.example;

import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import hibernate1.annot;
public class hqlexample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
//		System.out.println("Enter name: ");
//		String n = sc.next();
		//HQL Syntax
//		String query = "from annot";
//		String query = "from annot where name=:x";
//		String query = "from annot as s where s.name=:x and s.DetailsID='1'";
//		Query q = s.createQuery(query);
//		q.setParameter("x", n);
//		List<annot> list = q.list();
//		for(annot s1 : list) {
//			System.out.println(s1.getName() + " / " + s1.getAge() + " / " + s1.getDetailsId() + " / " + s1.getAddeddate());
//		}
//		System.out.println("------------------------------------------");
		
		Transaction tx = s.beginTransaction();
		// Deleting data :(
//		Query q1 = s.createQuery("delete from annot as a where a.name='bye'");
//		int r = q1.executeUpdate();
//		System.out.println("Deleted: " + r);
		
		//Update Query
		Query q2 = s.createQuery("update annot set name='byebye' where DetailsId='1'");
		int r = q2.executeUpdate();
		System.out.println(r + " Objects updated");
		tx.commit();
		s.close();
		factory.close();
	}
}
