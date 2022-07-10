package by.epam.tr.main;

import java.util.Arrays;
import java.util.Random;

public class Array04 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а1 а2 ,..., аn .
		// Выяснить, будет ли она возрастающей.

		int[] ar = new int[6];  // создаем целочисленный массив
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {  // цикл, генерирующий элементы массива
			ar[i] = rand.nextInt(5);

		}
		System.out.print(Arrays.toString(ar));// выводим эл-ты массива на консоль

		boolean folse = false;   // объявляем булеву переменную
		boolean flag = true;   // объявлем еще одну булеву, предполагая, что она ТРУ
		for (int i = 1; i < ar.length; i++) {   // запускаем цикл перебора массива
			if (ar[i] <= ar[i - 1]) {   // если следующий элемент не больше предыдущего
				flag = folse;   // флажку присваивается ФОЛС и прерываем цикл
				break; 
			}
		}
		if (flag) { // если флаг ТРУ, то вуаля!
			System.out.println(" - последовательность возрастет");
		} else {
			System.out.println(" - не является возрастающей");
		}
	}

}
