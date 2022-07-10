package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап.
		// Создать массив из четных чисел этой последовательности.
		// Если таких чисел нет, то вывести сообщение об этом факте.

		int sum = 0;
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };//последовательность с четными
		//int[] ar1 = {3,5,7,9,13,15,};// без четных (для проверки)
		//Random rand = new Random();

		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				sum = sum + 1;
			}
		}
		if (sum == 0) {
			System.out.println("массив без четных");
			return;
		}
		int[] ar2 = new int[sum];

		for (int i = 0, j = 0; i < ar1.length; i++)
			if (ar1[i] % 2 == 0) {
				ar2[j] = ar1[i];
				j++;
			}
		System.out.println(Arrays.toString(ar2));
	}

}
