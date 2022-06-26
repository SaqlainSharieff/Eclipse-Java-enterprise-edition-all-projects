package datastructure;

import java.util.Scanner;

public class IncomeTax {
	
	public void tax(double amount) {
		if(amount<=180000) {
			System.out.println("Income range falls under slab A"+"\n"+"Tax payable Nil");
		}else if(amount>=181001 & amount<=300000) {
			double taxed=amount*0.1;
			System.out.println("Income range falls under slab B"+"\n"+"Tax payable 10%");
			System.out.println(taxed);
		}else if(amount>=300001 & amount<=500000) {
			double taxed=amount*0.2;
			System.out.println("Income range falls under slab C"+"\n"+"Tax payable 20%");
			System.out.println(taxed);
		}else if(amount>=500001 & amount<=1000000) {
			double taxed=amount*0.3;
			System.out.println("Income range falls under slab D"+"\n"+"Tax payable 30%");
			System.out.println(taxed);
		}
	} 

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter CTC: ");
		double ctc=in.nextDouble();
		IncomeTax it=new IncomeTax();
		it.tax(ctc);
		in.close();
		
	}

}
