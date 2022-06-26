package oops;

public class Client {

	public static void main(String[] args) {
		
		Persistence p=new FilePersistence();
		p.persist();
		Persistence j=new DatabasePersistence();
		j.persist();

	}

}
