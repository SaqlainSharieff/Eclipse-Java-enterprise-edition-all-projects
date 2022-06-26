package generics;

public class Pair<T> {

	T key;
	T value;

	public Pair(T key, T value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Pair() {
		super();
	}

	public void setKey(T key) {
		this.key = key;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	

}
