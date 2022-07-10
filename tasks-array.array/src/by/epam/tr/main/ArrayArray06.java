package by.epam.tr.main;

import java.util.Random;

public class ArrayArray06 {

	public static void main(String[] args) {
		// Дана матрица. Вывести на экран все нечетные столбцы,
		// у которых первый элемент больше последнего.

		int[][] mas = new int[6][6];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d ]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nНечетные столбцы");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 1; j < mas[i].length; j += 2) {
				System.out.printf("[%3d]", mas[i][j]);

			}

			System.out.println();
		}
	}
}
