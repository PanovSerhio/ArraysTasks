package by.epam.tr.main;

//import java.util.Random;
//import java.util.Scanner;

public class ArrayArray03 {

	public static void main(String[] args) {

		// dana matrix. vyvesti First & Last column.
		int[][] mas = new int[3][4];

		int[] line1 = { 1, 2, 3, 4 };
		int[] line2 = { 4, 1, 2, 3 };
		int[] line3 = { 1, 2, 3, 4 };

		mas[0] = line1;
		mas[1] = line2;
		mas[2] = line3;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(" [" + mas[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println("Column First ------ ");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(" [" + mas[i][0] + "] ");
		}

		System.out.println("Column Last ------- ");
		for (int i = 0; i < mas.length; i++) {
			System.out.println(" [" + mas[i][mas[i].length - 1] + "] ");
		}
		System.out.println();

	}
}