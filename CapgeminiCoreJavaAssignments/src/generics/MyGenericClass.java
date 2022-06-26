package generics;

public class MyGenericClass<T> {

	T[] arr;
	
	public MyGenericClass(T[] arr) {
		super();
		this.arr = arr;
	}



public <E> T[] exchange(int i,int j) {
		
	
		T temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
			return arr;		
	}
}
