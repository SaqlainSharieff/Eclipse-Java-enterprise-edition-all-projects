package datastructure;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		
		int[] num=new int[15];
		num[0]=5;
		num[1]=12;
		num[2]=14;
		num[3]=6;
		num[4]=78;
		num[5]=19;
		num[6]=1;
		num[7]=23;
		num[8]=26;
		num[9]=35;
		num[10]=37;
		num[11]=7;
		num[12]=52;
		num[13]=43;
		num[14]=86;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int value=in.nextInt();
		for(int i=0;i<num.length;i++) {
			if(value == num[i]) {
				System.out.println("found");
				break;
			}
		}
		
	}

}
