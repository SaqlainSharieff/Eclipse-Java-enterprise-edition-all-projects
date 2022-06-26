package com.cg.SeventhQuestion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringExpressionLanguage {
	
	@Value("#{ 22+11 }")
	private int x;
	
	@Value("#{2+9}")
	private int y;
	
	public String getMystring() {
		return mystring;
	}
	public void setMystring(String mystring) {
		this.mystring = mystring;
	}
	@Value("#{'HI' + 'How are you'}")
	private String mystring;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "SpringExpressionLanguage [x=" + x + ", y=" + y + "]";
	}
	
	
	

}
