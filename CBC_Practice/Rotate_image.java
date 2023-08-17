package CBC_Practice;

import java.util.Scanner;

public class Rotate_image {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// Rotate the array by 90 degrees anti-clockwise
		int[][] rotatedArr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotatedArr[i][j] = arr[j][n - 1 - i];
			}
		}
		// Print the rotated array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotatedArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}