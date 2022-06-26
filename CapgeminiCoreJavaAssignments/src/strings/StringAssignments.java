package strings;

public class StringAssignments {

	public static void main(String[] args) {
		
		String str="Java string pool refers to a collection of Strings which are stored in Heap memory!";
		String newString=str.toLowerCase();
		System.out.println(newString);

		String uppercase=str.toUpperCase();
		System.out.println(uppercase);
		
		String replaced=str.replace('a','$');
		System.out.println(replaced);
		
		boolean check=str.contains("collection");
		System.out.println(check);
		
		boolean compare=str.equals(newString);
		System.out.println(compare);
		
		
		
	}

}
