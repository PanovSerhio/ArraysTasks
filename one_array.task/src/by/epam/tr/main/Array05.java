package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		// ���� ������������������ ����������� ����� �1 , �2 ,..., ��.
		// ������� ������ �� ������ ����� ���� ������������������.
		// ���� ����� ����� ���, �� ������� ��������� �� ���� �����.

		int sum = 0;
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };//������������������ � �������
		//int[] ar1 = {3,5,7,9,13,15,};// ��� ������ (��� ��������)
		//Random rand = new Random();

		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				sum = sum + 1;
			}
		}
		if (sum == 0) {
			System.out.println("������ ��� ������");
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
