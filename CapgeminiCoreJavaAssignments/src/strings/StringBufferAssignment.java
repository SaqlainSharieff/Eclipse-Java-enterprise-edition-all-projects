package strings;

public class StringBufferAssignment {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Welcome");
		sb.append(" Home!");
		System.out.println(sb);
		sb.insert(7, " to");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
