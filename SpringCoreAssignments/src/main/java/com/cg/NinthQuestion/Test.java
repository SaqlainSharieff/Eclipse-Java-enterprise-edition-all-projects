package com.cg.NinthQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
     //two methods init() and destroy() for beans
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/cg/NinthQuestion/studentconfig.xml");
		Student stud = (Student)context.getBean("student");
		System.out.println(stud);
		
		context.registerShutdownHook();
	}

}
