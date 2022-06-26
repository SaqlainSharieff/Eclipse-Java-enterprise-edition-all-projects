package collectionassignments;

import java.util.HashSet;

public class GeneralStore {

	public static void main(String[] args) {

		Product p1 = new Product("Colgate", "Toothpaste");
		Product p2 = new Product("Sunsilk", "Shampoo");
		Product p3 = new Product("Parle-G", "Biscuit");
		Product p4 = new Product("Amul", "Milk");

		HashSet<Product> set = new HashSet<>(10);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		// Set does not allows duplicate entry
		// set.add(p1);
		for (Product p : set) {
			System.out.println(p.productName);
		}
	}

}
