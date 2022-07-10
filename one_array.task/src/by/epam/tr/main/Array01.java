package by.epam.tr.main;

//import java.util.Random;
//import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// v massive A[N] naturalnye chisla. Nayti summu teh elementov
		// kotorye kratny dannomy K.

		int[] mas;
		mas = new int[5];
		int k = 3;
		int sum = 0;

		mas[0] = 6;
		mas[1] = 5;
		mas[2] = 3;
		mas[3] = 1;
		mas[4] = 8;

		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}
		
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0)
				sum = sum + mas[i];
		}

		System.out.print("сумма кратных чисел = [" + sum + "] ");
	}
}
