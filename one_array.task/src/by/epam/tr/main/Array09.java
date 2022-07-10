package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array09 {

	public static void main(String[] args) {
		// ���� �������������� ����� �1 ,�2 ,..., �n . 
		//�������� ������� ���������� � ���������� ��������.

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
		System.out.println(" ����������� �������� = " + ar[min]);
		System.out.println(" ������������ �������� = " + ar[max]);
		
		
		int temp = ar[min];
		ar[min] = ar[max];
		ar[max] = temp;
		System.out.println(Arrays.toString(ar));
	}
	
}
