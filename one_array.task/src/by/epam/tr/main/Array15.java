package by.epam.tr.main;

import java.util.Arrays;
//import java.util.Random;

public class Array15 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел.. a a an, , , 1 2
		// Указать те ее элементы, которые принадлежат отрезку [с, d].

		int arr[] = new int[15];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 - 30); // чтобы были отрицательные элементы.
			System.out.print(arr[i] + "; ");
		}
		System.out.print("\nSorted: \n");

		Arrays.sort(arr); // Сортируем массив

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ";  "); // Выводим отсортированный массив на консоль.
		}
		System.out.print("\n\n");
		System.out.print("Отрезок [c,d]: ");

		int c = -20;
		int d = 20;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= c && arr[i] <= d) {

				System.out.print(arr[i] + "; ");

			}
		}

	}
}
