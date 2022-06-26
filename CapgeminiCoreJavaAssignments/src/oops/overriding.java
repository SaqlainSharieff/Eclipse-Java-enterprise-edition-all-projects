package oops;

public class overriding {

	public static void main(String[] args) {
		
		Employee emp=new Manager();
		emp.calcsalary(5000);

	}

}


class Employee{
	
	int salary;
	int incentive;
	int overtime;
	
	
	public Employee() {
		
	}


	public Employee(int salary, int incentive, int overtime) {
		super();
		this.salary = salary;
		this.incentive = incentive;
		this.overtime = overtime;
	}


	public void calcsalary(int amt) {
		
	}
}

class Labour extends Employee{

	@Override
	public void calcsalary(int amt) {
		super.salary=amt+super.overtime;
		System.out.println("Salary is:"+salary);
	}
	
	
}

class Manager extends Employee{

	@Override
	public void calcsalary(int amt) {
		super.salary=amt+super.incentive;
		System.out.println("Salary is:"+salary);
	}
	
	
}


