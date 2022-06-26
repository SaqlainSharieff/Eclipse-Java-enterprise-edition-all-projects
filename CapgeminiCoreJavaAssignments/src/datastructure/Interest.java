package datastructure;

public class Interest {
	
	public double simpleInterest(double p,double r,double t) {
		double si=(p*r*t)/100;
		return si;
	}
	
	public double compInterest(double p,double r,double t,double n) {
		double amt=p*(1+(r/n));
		double ci=Math.pow(amt,n*t);
		return ci;
	}

	public static void main(String[] args) {
		Interest i=new Interest();
		double amount =i.simpleInterest(5000, 10, 2);
		System.out.println(amount);
		

	}

}
