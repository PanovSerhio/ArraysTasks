package by.epam.tr.main;

import java.util.Random;

public class Array13 {

	public static void main(String[] args) {
		// Определить количество элементов последовательности натуральных чисел,
		// кратных числу М и заключенных в промежутке от L до N.

		Random rand = new Random();

		int[] mas = new int[11];// массив из 10 элементов
		int size = mas.length;
		System.out.print("\tВыводим на консоль рандомный массив:\n\n");

		for (int i = 0; i < size; i++) {
			mas[i] = rand.nextInt(61);//рандомная инициализация эл-в массива до 60
		}

		for (int i = 0; i < size; i++) {
			System.out.print("i[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println("\n\n\tОпределяем количество элементов:");

		int m = 5; //кратно 5
		int l = 10;
		int n = 40; //диапазон от 10 до 40 включительно
		int count = 0; // включаем счетчик для подсчета подходящих элементов.

		for (int i = 0; i < size; i++) {
			if (mas[i] % m == 0 && mas[i] >= l && mas[i] <= n) {
				count++;
				System.out.print("\n" + count + ") " + mas[i] + "; ");

			}

		}

		System.out.println();
	}
}
