package by.epam.tr.main;

public class Array06 {

	public static void main(String[] args) {
		// ���� ������������������ ����� �1 ,�2 ,..., ��.
		// ������� ���������� ����� �������� ���, ���������� ��� ��� �����.

		int ar[] = { 8, -5, -2, 0, 1, 3, 6, 0, 14, 7 };
		int min = ar[1];
		int max = ar[1];

		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (min > ar[i]) {
				min = ar[i];
			}
		}

		System.out.println("������������ �������� = " + max);
		System.out.println("����������� �������� = " + min);
		System.out.println("���������� ����� = " + (max - min));
	}

}
