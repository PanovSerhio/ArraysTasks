package by.epam.tr.main;

import java.util.Random;

public class Array02 {

	public static void main(String[] args) {
		// В целочисленной последовательности есть нулевые элементы. 
		//Создать массив из номеров этих элементов.

		int n = 10;
		int[] ar1 = new int[n];
		

		Random rand = new Random();
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = rand.nextInt(10);
			System.out.print("[" + i + "]=" + ar1[i] + "; ");
		}
		System.out.println();
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == 0) {

				System.out.print("[" + ar1[i] + "]=" + i + "; ");
			}

		}
	}
}
