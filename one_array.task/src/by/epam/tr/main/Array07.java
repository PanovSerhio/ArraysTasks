package by.epam.tr.main;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. 
		//�������� ��� �� �����, ������� ������� Z, ���� ������.
		//���������� ���������� �����.
		
		int []ar = {25, 99,2,5,-3,8,-6,9,11,15};
		int z = 7;
		int count = 0;
		
		for(int i=0; i<ar.length; i++) {
			if (ar[i]>10) {
				ar[i] = z;
				count = count + 1;
			}
		}
		System.out.print(Arrays.toString(ar)+ " ���������� ����� - " + count);

	}

}
