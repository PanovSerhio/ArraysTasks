package by.epam.tr.main;

public class Array06 {

	public static void main(String[] args) {
		// Дана последовательность чисел а1 ,а2 ,..., ап.
		// Указать наименьшую длину числовой оси, содержащую все эти числа.

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

		System.out.println("Максимальное значение = " + max);
		System.out.println("Минимальное значение = " + min);
		System.out.println("Наименьшая длина = " + (max - min));
	}

}
