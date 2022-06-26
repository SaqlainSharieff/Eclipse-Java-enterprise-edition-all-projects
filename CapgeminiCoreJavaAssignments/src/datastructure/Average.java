package datastructure;

public class Average {

	public static void main(String[] args) {

		int[][] marks = { { 60, 80, 50 }, { 70, 80, 90 }, { 40, 55, 84 } };
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {
				sum = sum + marks[i][j];
			}
			float average = sum / 3;
			int total = sum;
			System.out.println("Average: "+average);
			System.out.println("Total:"+total);
		}

	}

}
