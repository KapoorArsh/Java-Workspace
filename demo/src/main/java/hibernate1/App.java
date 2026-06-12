package hibernate1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("Project Started....");
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        //creating demo class object
//        hello st = new hello();
//        st.setId(10);
//        st.setName("tata");
//        st.setAge(11);
//        System.out.println(st);
        
        //creating annot class object
        annot obj = new annot();
        obj.setName("demo2");
        obj.setAge(101);
        obj.setOpen(true);
        obj.setAddeddate(new Date());
       // transient
        //Reading image
//        FileInputStream fis = new FileInputStream("src/main/java/2.jpg");
//        byte [] data = new byte[fis.available()];
//        fis.read(data);
//        obj.setImage(data);

        // persistent-associated with session object as well as database
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        	session.save(obj);
        	tx.commit();
        	session.close();
        	//save and close karke waapis set karna is detached: value is not changed in database
        	obj.setName("Arsh");
        	System.out.println(obj);
        	System.out.println("Done");
        	
    }
}
