package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(UnsupportedOperationException exp){
			exp.printStackTrace();
			System.out.println("Exception caught");
		}
		

	}

}
