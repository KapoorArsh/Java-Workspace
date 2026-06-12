package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.student;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbc.config.xml");
//	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//		
		//for annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
	
		StudentDao studentdao=context.getBean("studentdao",StudentDao.class);
		//for inserting
//		student stu = new student();
//		stu.setId(12);
//		stu.setName("hello");
//		stu.setCity("city");
//		int result = studentdao.insert(stu);
//		System.out.println("Number of record inserted " + result);
		
		//for updating
//		student stu = new student();
//		stu.setId(10);
//		stu.setName("Noor");
//		stu.setCity("CHD");
//		int result = studentdao.change(stu);
//		System.out.println("Number of record changed " + result);
		
		//for deleting
//		int result = studentdao.delete(10);
//		System.out.println("Number of record deleted: " + result);
		
		//For selecting single data
//		student student=studentdao.getstudent(10);
//		System.out.println(student);
//		
		//For selecting multiple students
		List<student> students= studentdao.getAllStudents();
		for(student s : students) {
			System.out.println(s);
		}
	}
}
