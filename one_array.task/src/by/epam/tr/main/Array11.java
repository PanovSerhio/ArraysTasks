package by.epam.tr.main;

import java.util.Random;

public class Array11 {

	public static void main(String[] args) {
		// Даны натуральные числа а1 ,а2 ,..., аn .
		// Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

		Random rand = new Random();
		int[] mas = new int[10];
		int size = mas.length;
		int m = 5;
		int l = 3;// остаток от деления

		for (int i = 0; i < size; i++) {
			mas[i] = rand.nextInt(60);
		}
		for (int i = 0; i < size; i++) {
			System.out.print("i[" + i + "]=" + mas[i] + "; ");

		}
		System.out.println();
		int count = 0;

		for (int i = 0; i < size; i++) {

			if (mas[i] % m == l) {
				count++;

				System.out.println("\n" + count + ") " + mas[i] + "; ");
			}

		}
	}
}
