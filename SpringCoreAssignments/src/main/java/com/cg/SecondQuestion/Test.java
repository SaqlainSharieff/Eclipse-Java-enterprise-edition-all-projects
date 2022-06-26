package com.cg.SecondQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/SecondQuestion/questionconfig.xml");
	Question quest = (Question)context.getBean("quest");
	System.out.println(quest.getQuestionId());
	System.out.println(quest.getQuestion());
	System.out.println(quest.getListAns());
	System.out.println(quest.getMapAns());
	System.out.println(quest.getSetAns());
	}

}
