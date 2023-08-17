package CBC_Practice;

import java.util.Scanner;

public class Reshape_the_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int r = sc.nextInt();
		int c = sc.nextInt();
		if (m * n != r * c) {
			// Reshape not possible, print original matrix
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}
		// Reshape possible
		int[][] res = new int[r][c];
		int row = 0, col = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[row][col] = mat[i][j];
				col++;
				if (col == c) {
					col = 0;
					row++;
				}
			}
		}
		// Print the reshaped matrix
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}