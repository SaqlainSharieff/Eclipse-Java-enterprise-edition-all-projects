package datastructure;

public class ArmstrongNumber {

	public static void main(String[] args) {
		for(int k=100;k<1000;k++) {
			
		String str=Integer.toString(k);
		int[] newNumber=new int[9];
		for(int i=0;i<str.length();i++) {
			int num=Character.getNumericValue(str.charAt(i));
			newNumber[i]=(int)Math.pow(num,3);
			
		}
		int sum=0;
		for(int j=0;j<str.length();j++) {
			
			sum=sum+newNumber[j];
		}
		
		if(k==sum) {
			System.out.println(k);
		}
		}
	}

}
