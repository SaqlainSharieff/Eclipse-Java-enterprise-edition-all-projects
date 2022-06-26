package generics;

import java.util.HashSet;

public class Employee {

	Integer id;
	String name;
	Integer salary;
	String department;

	public Employee(Integer id, String name, Integer salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {

	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		Employee emp1 = new Employee(1, "John", 5000, "Electronics");

		Employee emp2 = new Employee(1, "Jack", 6000, "Electronics");

		Employee emp3 = new Employee(1, "Harry", 7000, "Electronics");

		Employee emp4 = new Employee(1, "Rahul", 8000, "Electronics");

		HashSet<Employee> set = new HashSet<Employee>();

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);

		System.out.println(set);
		
		//Student st1=new Student(1,"Hamza","ABCD");
		//Student st2=new Student(2,"Intekhab","xyz");
		
		
		
		//set.add(st1);
	}

}

class Student {

	Integer id;
	String name;
	String College;

	public Student() {

	}

	public Student(Integer id, String name, String college) {

		this.id = id;
		this.name = name;
		College = college;
	}

}
