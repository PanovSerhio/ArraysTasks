package by.epam.tr.main;

//import java.util.Random;

public class Array03 {

	public static void main(String[] args) {
		// ���� ������������������ ����� ����� �1 �2,..., �n .
		// ��������, ����� ����� ����������� ������ - ������������� ���
		// �������������.

		int[] ar = new int[10];
		// Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = ((int) (Math.random() * 31) - 15);//��������� ������������ ������ � ������� �� -15 �� +15 
			System.out.print("[" + ar[i] + "] ");//������� �� ������� ������ �������
		}
		System.out.println();

		if (ar[0] < 0) {
			System.out.println("������ ����������� ������������� > " + ar[0]);
		}

		if (ar[0] >= 0) {
			System.out.println("������ ����������� ������������� > " + ar[0]);

		}

	}
}
