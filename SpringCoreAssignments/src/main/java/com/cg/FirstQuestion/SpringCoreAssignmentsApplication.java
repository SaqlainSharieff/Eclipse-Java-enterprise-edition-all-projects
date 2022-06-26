package com.cg.FirstQuestion;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cg.SecondQuestion.Question;



public class SpringCoreAssignmentsApplication {

	public static void main(String[] args) {
		
		ApplicationContext cont = 
				new ClassPathXmlApplicationContext("com/cg/FirstQuestion/web.xml");
		Customer customer = (Customer)cont.getBean("customer");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getAddress());
		
	
	
		
		
		
	}

}
