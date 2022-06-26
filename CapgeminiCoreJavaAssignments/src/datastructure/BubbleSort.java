package datastructure;

public class BubbleSort {

	public static void main(String[] args) {

		int[] num = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = num.length-1; j >=0; j--) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}

		}

		for (int k = 0; k < num.length; k++) {
			System.out.println(num[k]);
		}
	}

}
