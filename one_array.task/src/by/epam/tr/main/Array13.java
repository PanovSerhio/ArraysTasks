package by.epam.tr.main;

import java.util.Random;

public class Array13 {

	public static void main(String[] args) {
		// ���������� ���������� ��������� ������������������ ����������� �����,
		// ������� ����� � � ����������� � ���������� �� L �� N.

		Random rand = new Random();

		int[] mas = new int[11];// ������ �� 10 ���������
		int size = mas.length;
		System.out.print("\t������� �� ������� ��������� ������:\n\n");

		for (int i = 0; i < size; i++) {
			mas[i] = rand.nextInt(61);//��������� ������������� ��-� ������� �� 60
		}

		for (int i = 0; i < size; i++) {
			System.out.print("i[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println("\n\n\t���������� ���������� ���������:");

		int m = 5; //������ 5
		int l = 10;
		int n = 40; //�������� �� 10 �� 40 ������������
		int count = 0; // �������� ������� ��� �������� ���������� ���������.

		for (int i = 0; i < size; i++) {
			if (mas[i] % m == 0 && mas[i] >= l && mas[i] <= n) {
				count++;
				System.out.print("\n" + count + ") " + mas[i] + "; ");

			}

		}

		System.out.println();
	}
}
