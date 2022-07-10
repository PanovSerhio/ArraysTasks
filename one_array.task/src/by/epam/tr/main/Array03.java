package by.epam.tr.main;

//import java.util.Random;

public class Array03 {

	public static void main(String[] args) {
		// Дана последовательность целых чисел а1 а2,..., аn .
		// Выяснить, какое число встречается раньше - положительное или
		// отрицательное.

		int[] ar = new int[10];
		// Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = ((int) (Math.random() * 31) - 15);//рандомное присваивание данных в массиве от -15 до +15 
			System.out.print("[" + ar[i] + "] ");//выводим на консоль данные массива
		}
		System.out.println();

		if (ar[0] < 0) {
			System.out.println("Раньше встречается отрицательное > " + ar[0]);
		}

		if (ar[0] >= 0) {
			System.out.println("Раньше встречается положительное > " + ar[0]);

		}

	}
}
