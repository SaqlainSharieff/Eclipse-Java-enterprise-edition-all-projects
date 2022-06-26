package datastructure;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] marks = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the score for subjects: ");
			marks[i] = s.nextDouble();
		}
		int count = 0;
		for (int j = 0; j < 3; j++) {

			if (marks[j] > 60) {
				count++;
			}
			
		}
		if(count==3) {
			System.out.println("Passed");
		}
		if(count==2) {
			System.out.println("Promoted");
		}
		if(count==1||count==0) {
			System.out.println("Failed");
		}
		s.close();
	}

}
