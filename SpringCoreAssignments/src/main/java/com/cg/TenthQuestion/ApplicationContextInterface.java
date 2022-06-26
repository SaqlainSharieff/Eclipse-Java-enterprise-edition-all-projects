package com.cg.TenthQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextInterface {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/TenthQuestion/aware.xml");
		Application app = (Application)context.getBean("app");
		System.out.println(app.getQuestionId());
		System.out.println(app.getQuestion());
		System.out.println(app.getAnswers());
		System.out.println(context);
	
}
}
