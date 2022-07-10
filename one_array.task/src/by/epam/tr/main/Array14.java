package by.epam.tr.main;

public class Array14 {

	public static void main(String[] args) {
		// Дан одномерный массив A[N]. Найти:
		// max(a2 a4 a2k + min(a1 a3 a2k+)

		int[] array = { 4,- 8, 5, 7, -15, 13, 8, 3, 11, -25, 16 };

		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max = " + max);

		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max + min = " + (max + min));

	}

}
