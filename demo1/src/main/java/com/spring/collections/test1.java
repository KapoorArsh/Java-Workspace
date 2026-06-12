package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/confi.xml");
		emp emp1 = (emp) context.getBean("emp");
		System.out.println(emp1);
	}
}
