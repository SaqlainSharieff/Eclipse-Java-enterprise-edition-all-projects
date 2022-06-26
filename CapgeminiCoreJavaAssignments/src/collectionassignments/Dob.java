package collectionassignments;

import java.util.Date;

public class Dob {

	String name;
	Date date;
	public Dob(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}
	public Dob() {
		super();
	}
	@Override
	public String toString() {
		return "Dob [name=" + name + ", date=" + date + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}