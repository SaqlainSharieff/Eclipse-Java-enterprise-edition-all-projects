package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// Create Operation

		StudentService service = new StudentServiceImpl();
		Student student = new Student();

		// Create Operation

		student.setStudentid(6);
		student.setName("Akshay kumar");
		service.addStudent(student);

		// Retrieve Operation

		student = service.findStudentById(1);
		System.out.print("ID:" + student.getStudentid());
		System.out.println(" Name:" + student.getName());

		// Update Operation

		student = service.findStudentById(5);
		student.setName("M S Dhoni");
		service.updateStudent(student);

		// Delete Operation
		student = service.findStudentById(5);
		service.removeStudent(student);
	}

}
