package CBC_Practice;

import java.util.Scanner;
import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i] * arr1[i];
		}
		Arrays.sort(arr2);
		for (int i = 0; i < n; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
