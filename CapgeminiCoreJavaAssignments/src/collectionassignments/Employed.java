package collectionassignments;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Employed {

	Integer id;
	String name;
	String department;
	Integer salary;

	public static String ch;

	public Employed() {
		super();
	}

	public Employed(Integer id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Comparator<Employed> comp;

		System.out.println("Enter your choice: a,b,c or d");
		String str = in.next();
		ch = str;

		if (ch.equals("a")) {
			comp = new IdComparator();
		} else if (ch.equals("b")) {
			comp = new NameComparator();
			;
		} else if (ch.equals("c")) {
			comp = new DepartmentComparator();
		} else {
			comp = new SalaryComparator();
		}
		Employed emp1 = new Employed(1, "BB", "CC", 22000);
		Employed emp2 = new Employed(2, "AB", "CC", 33000);
		Employed emp3 = new Employed(3, "CN", "GC", 4000);
		Employed emp4 = new Employed(4, "DJ", "CC", 52000);
		Employed emp5 = new Employed(5, "EB", "CC", 6000);
		Employed emp6 = new Employed(6, "FK", "JC", 7000);
		Employed emp7 = new Employed(7, "GB", "BC", 8000);
		Employed emp8 = new Employed(8, "HL", "CC", 9000);
		Employed emp9 = new Employed(9, "IB", "FC", 10000);
		Employed emp10 = new Employed(10, "JM", "CC", 11000);

		Set<Employed> set = new TreeSet<>(comp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		set.add(emp7);
		set.add(emp8);
		set.add(emp9);
		set.add(emp10);

		Iterator<Employed> itr = set.iterator();

		while (itr.hasNext()) {
			Employed e1 = itr.next();
			System.out.println(e1);
		}

		in.close();
	}

}

class NameComparator implements Comparator<Employed> {

	@Override
	public int compare(Employed o1, Employed o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class DepartmentComparator implements Comparator<Employed> {

	@Override
	public int compare(Employed o1, Employed o2) {

		return o1.getDepartment().compareTo(o2.getDepartment());
	}

}

class SalaryComparator implements Comparator<Employed> {

	@Override
	public int compare(Employed o1, Employed o2) {

		return o1.getSalary().compareTo(o2.getSalary());
	}

}

class IdComparator implements Comparator<Employed> {

	@Override
	public int compare(Employed o1, Employed o2) {

		return o1.getId().compareTo(o2.getId());
	}

}
