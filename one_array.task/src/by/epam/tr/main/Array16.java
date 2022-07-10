package by.epam.tr.main;

public class Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1, 3, 4, 8, 2, 26, 17, 9, 11, 16};
		int n = 4;
		int max = array[0] + array[9];
		for (int i = 0; i < n; i++) {
			if (array[i] + array[2 * n - i - 1] > max) {
				max = array[i] + array[2 * n - i - 1];
			}
			System.out.print(array[i] + "+" + array[2 * n - i - 1]);
			System.out.println();
		}
		System.out.println("max=" + max);

	}

}
