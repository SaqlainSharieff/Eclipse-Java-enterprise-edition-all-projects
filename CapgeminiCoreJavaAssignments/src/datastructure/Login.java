package datastructure;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] name = new String[5];
		name[0] = "Intekhab";
		name[1] = "Ravi";
		name[2] = "John";
		name[3] = "Harry";
		name[4] = "Jacob";

		int[] password = new int[5];
		password[0] = 123;
		password[1] = 234;
		password[2] = 345;
		password[3] = 456;
		password[4] = 567;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Login name: ");
		String loginName = in.next();
		System.out.println("Enter the password:");
		int pass = in.nextInt();
		int count=0;
		for (int i = 0; i < loginName.length(); i++) {
			System.out.println(name[i]);
			System.out.println(password[i]);
			
			

		}
	}

}
