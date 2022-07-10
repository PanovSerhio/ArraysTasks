package by.epam.tr.main;

import java.util.Random;

public class ArrayArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mas = new int[9][6];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(60);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d ]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n");

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d - ", i);
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%3d] ", mas[i][j]);
				}
				System.out.println();
			}

		}
	}
}



