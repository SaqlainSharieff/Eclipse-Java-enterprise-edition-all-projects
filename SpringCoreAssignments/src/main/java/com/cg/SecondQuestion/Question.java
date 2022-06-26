package com.cg.SecondQuestion;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
 private int questionId;
 private String question;
 //answers if of type list
 private List<String> listAns;
 

 //for answers being type string
 private Set<String> setAns;
 
 //integer value represents answers sequence number
 private Map<Integer,String> mapAns;
 
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}


public List<String> getListAns() {
	return listAns;
}
public void setListAns(List<String> listAns) {
	this.listAns = listAns;
}
public Set<String> getSetAns() {
	return setAns;
}
public void setSetAns(Set<String> setAns) {
	this.setAns = setAns;
}
public Map<Integer, String> getMapAns() {
	return mapAns;
}
public void setMapAns(Map<Integer, String> mapAns) {
	this.mapAns = mapAns;
}

public Question(int questionId, String question, List<String> listAns, Set<String> setAns,
		Map<Integer, String> mapAns) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.listAns = listAns;
	this.setAns = setAns;
	this.mapAns = mapAns;
}
public Question() {
	super();
	
}
 
}
