package by.epam.tr.main;

//import java.util.Random;

public class Array08 {

	public static void main(String[] args) {
		// ��� ������ �������������� �����, ����������� �������� N.
		// ����������, ������� � ��� �������������,
		// ������������� � ������� ���������.

		
		int[] mas = {-5,-6,-7,0,5,6,7,8};
		
		int negative = 0;
		int pozitive = 0;
		int zero = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				negative += 1;
			}
			if (mas[i] > 0) {
				pozitive += 1;
			}
			if (mas[i] == 0) {
				zero += 1;
			}
		}
		System.out.println("������������� �������� - " + negative);
		System.out.println("������������� �������� - " + pozitive);
		System.out.println("������� �������� - " + zero);

	}

}
