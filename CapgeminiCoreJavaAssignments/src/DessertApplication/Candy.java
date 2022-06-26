package DessertApplication;

public class Candy extends DessertItem {

	String name;
	double price;
	double tax;
		
	@Override
	public void getCost() {
		
	}
	
	public Candy() {
		
	}

	public Candy(String name, double price, double tax) {
		
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	public Candy addNewCandy(String name,double price,double tax) {
		return new Candy(name,price,tax);
	}
	
	
	
}
