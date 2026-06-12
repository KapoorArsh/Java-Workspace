package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	public static void main(String[] args) {
		System.out.println("hello world");
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		student stu=(student) context.getBean("student1");
		student stu1=(student) context.getBean("student2");
		student stu2=(student) context.getBean("student3");
		System.out.println(stu);
		System.out.println(stu1);
		System.out.println(stu2);
	}
}
