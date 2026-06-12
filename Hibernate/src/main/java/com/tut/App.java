package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Project Started...");
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.Config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your name: ");
    	String b = sc.nextLine();
    	System.out.println("Enter your id: ");
    	int a = sc.nextInt();
    	System.out.println("Enter your city: ");
    	String c = sc.next();
        Student st = new Student();
        st.setId(a);
        st.setName(b);
        st.setCity(c);
        System.out.println(st);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        System.out.println("Done");
    }
}
