package com.cg.EighthQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
     //using @postContruct and @PreDestroy
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("com/cg/EighthQuestion/studentconfig.xml");
		Student stud = (Student)context.getBean("student");
		System.out.println(stud);
		
		context.registerShutdownHook();
	}

}
