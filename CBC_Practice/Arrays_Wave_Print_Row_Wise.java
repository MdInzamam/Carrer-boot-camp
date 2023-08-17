package CBC_Practice;

import java.util.Scanner;

public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + ",");
				}
			} else {
				for (int k = arr.length - 1; k >= 0; k--) {

					System.out.print(arr[i][k] + ",");
				}
			}
			System.out.println();
		}
		System.out.println("end");

	}

}
