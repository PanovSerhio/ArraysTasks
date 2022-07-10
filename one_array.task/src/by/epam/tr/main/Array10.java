package by.epam.tr.main;

import java.util.Random;

public class Array10 {

	public static void main(String[] args) {
		// Даны целые числа а1 ,а2 ,..., аn . 
		//Вывести на печать только те числа, для которых аi > i.
		
		Random rand = new Random();
		int[] mas = new int[6];
		int size = mas.length;
		
		for(int i=0; i<size; i++) {
			mas[i] = rand.nextInt(7);
		}
		for(int i=0; i<size; i++) {
			System.out.print("i[" + i + "]=" + mas[i] + "; ");
							
		}
		System.out.println();
		
		for(int i=0; i<size; i++) {
			if((mas[i]*i)>i) {
				System.out.print(mas[i] + "; ");
			}
		}
		System.out.println();
	}
}