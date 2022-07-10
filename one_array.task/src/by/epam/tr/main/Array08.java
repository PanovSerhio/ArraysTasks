package by.epam.tr.main;

//import java.util.Random;

public class Array08 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N.
		// Подсчитать, сколько в нем отрицательных,
		// положительных и нулевых элементов.

		
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
		System.out.println("Отрицательные элементы - " + negative);
		System.out.println("Положительные элементы - " + pozitive);
		System.out.println("Нулевые элементы - " + zero);

	}

}
