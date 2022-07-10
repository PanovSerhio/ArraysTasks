package by.epam.tr.main;

public class ArrayArray01 {

	public static void main(String[] args) {

		// Создайть матрицу 3х4, заполнить её 0 и 1 так, чтобы в одной строке была одна 1.
		// 

		int[][] matrix;
		matrix = new int[3][4];
		int i;
		int j;
				
		matrix[0][0] = 1;
		matrix[0][1] = 0;
		matrix[0][2] = 0;
		matrix[0][3] = 0;
		matrix[1][0] = 0;
		matrix[1][1] = 1;
		matrix[1][2] = 0;
		matrix[1][3] = 0;
		matrix[2][0] = 0;
		matrix[2][1] = 0;
		matrix[2][2] = 1;
		matrix[2][3] = 0;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print(" [" + matrix[i][j] + "] ");
			}
				
		System.out.println();
		}

	}
}
