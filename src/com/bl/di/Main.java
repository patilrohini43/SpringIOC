package com.bl.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {	
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//		System.out.println("Xml file loaded");
//		Student student =context.getBean("student",Student.class);
//		student.display();
//		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Xml file loaded");
		Student student =context.getBean("student",Student.class);
		student.display();
		
		
		
		
	
}
}
