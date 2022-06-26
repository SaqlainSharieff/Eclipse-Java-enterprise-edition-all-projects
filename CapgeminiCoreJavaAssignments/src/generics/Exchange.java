package generics;

public  class Exchange {

	public static void main(String[] args) {
		
		Integer[] num= {1,2,3,4,5,6,7,8,9};
		MyGenericClass<Integer> class1=new MyGenericClass<>(num);
		class1.exchange(0, 5);
		for(Integer number:num) {
			System.out.println(number);
		}
	}

}
