package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array04 {

	public static void main(String[] args) {
		// ���� ������������������ �������������� ����� �1 �2 ,..., �n .
		// ��������, ����� �� ��� ������������.

		int[] ar = new int[6];  // ������� ������������� ������
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {  // ����, ������������ �������� �������
			ar[i] = rand.nextInt(5);

		}
		System.out.print(Arrays.toString(ar));// ������� ��-�� ������� �� �������

		boolean folse = false;   // ��������� ������ ����������
		boolean flag = true;   // �������� ��� ���� ������, �����������, ��� ��� ���
		for (int i = 1; i < ar.length; i++) {   // ��������� ���� �������� �������
			if (ar[i] <= ar[i - 1]) {   // ���� ��������� ������� �� ������ �����������
				flag = folse;   // ������ ������������� ���� � ��������� ����
				break; 
			}
		}
		if (flag) { // ���� ���� ���, �� �����!
			System.out.println(" - ������������������ ���������");
		} else {
			System.out.println(" - �� �������� ������������");
		}
	}

}
