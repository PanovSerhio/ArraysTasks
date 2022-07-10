package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array09 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . 
		//Поменять местами наибольший и наименьший элементы.

		int n = 10;
		int[] ar = new int[n];

		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(10);
			System.out.print(" [" + ar[i] + "] ");
		}
		System.out.println();

		int min = 0;
		int max = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < ar[min]) {
				min = i;
			}
			if (ar[i] > ar[max])
				max = i;
		}
		System.out.println(" Минимальное значение = " + ar[min]);
		System.out.println(" Максимальное значение = " + ar[max]);
		
		
		int temp = ar[min];
		ar[min] = ar[max];
		ar[max] = temp;
		System.out.println(Arrays.toString(ar));
	}
	
}
