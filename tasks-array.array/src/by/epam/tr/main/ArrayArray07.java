package by.epam.tr.main;

import java.util.Random;

public class ArrayArray07 {

	public static void main(String[] args) {
		// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов.
		// Math.abc - метод нахождения модуля числа.

		int[][] mas = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(-5, 15);
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
			
		}
		System.out.println("\nСумма модулей отрицательных нечетных элементов = " + sum);
	}

}
