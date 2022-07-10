package by.epam.tr.main;

import java.util.Random;
//import java.util.Scanner;

public class ArrayArray04 {

	public static void main(String[] args) {
		// dana matrix. vivodim na ekran First & Last sting

		int[][] mas = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d ]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------- First String --------");
		for (int j = 0; j < mas.length; j++) {
			System.out.printf("[%3d ]", mas[0][j]); // выводит первую строку правильно.
		}
		System.out.println();

		System.out.println("-------- Last String --------");
		for (int j = 0; j < mas.length; j++) {
			System.out.printf("[%3d ]", mas[4][j]); // данные "mas[4][j]" проставлены вручную. Как определить "length"
													// последней строки??
		}                                           // делал mas[j][mas[j].length - 1] - выводит последний СТОЛБИК, а не строку.
	}
}
