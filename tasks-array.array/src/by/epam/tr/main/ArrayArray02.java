package by.epam.tr.main;

import java.util.Random;

public class ArrayArray02 {

	public static void main(String[] args) {
		// ������� � ������� �� ����� ������� 2�3,
		// ����������� ���������� �������.

		int mas[][] = new int[2][3];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(" [" + mas[i][j] + "] ");
			}
			System.out.println();

		}
	}
}