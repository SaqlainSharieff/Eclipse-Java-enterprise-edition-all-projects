package DessertApplication;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		DessertItem item=new Candy();
		Candy candy=new Candy();
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the user type Customer or owner: ");
		String userType=in.next();
		if(userType.equalsIgnoreCase("owner")){
			System.out.println("Enter the item to enter:");
			String itemType=in.next();
			if(itemType.equalsIgnoreCase("candy")) {
				System.out.println("Enter the name of the candy: ");
				String name=in.next();
				System.out.println("Enter the price of the candy: ");
				double price=in.nextDouble();
				System.out.println("Enter the tax to be added: ");
				double tax=in.nextDouble();
				candy.addNewCandy(name,price,tax);
				item.addCandies(candy);
				System.out.println("Item added successfully");
				in.close();			}
		}

	}

}
