package com.cg.SeventhQuestion;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/cg/SeventhQuestion/expressionconfig.xml");
		
		SpringExpressionLanguage spel = (SpringExpressionLanguage) context.getBean("spel");
		
		System.out.println(spel);
		
		
	}

}
