package DessertApplication;

import java.util.ArrayList;
import java.util.List;

public abstract class DessertItem {

	List<Candy> candies = new ArrayList<Candy>();

	public abstract void getCost();

	public void addCandies(Candy candy) {
		candies.add(candy);
	}

	public void placeOrder() {

	}

	public DessertItem() {
		super();
	}

}
