package CBC_Practice;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] sum = adding(arr1, arr2);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]);
			if (i != sum.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(", END");
	}

	public static int[] adding(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int size;
		if (n > m) {
			size = n;
//	        	System.out.print(size+"N ");
		} else {
			size = m;
//	        	System.out.print(size+"M ");
		}
		int[] sum = new int[size];
		for (int i = 0; i < sum.length; i++) {
			int a = 0;
			if (i < n) {
				a = arr1[n - 1 - i];
			}
			int b = 0;
			if (i < m) {
				b = arr2[m - 1 - i];
			}
			int digitSum = a + b + sum[sum.length - 1 - i];
			sum[sum.length - 1 - i] = digitSum % 10;
			if (i < sum.length - 1) {
				sum[sum.length - 2 - i] += digitSum / 10;
			}
		}
		if (sum[0] == 0) {
			int[] newSum = new int[sum.length - 1];
			for (int i = 1; i < sum.length; i++) {
				newSum[i - 1] = sum[i];
			}
			return newSum;
		}
		return sum;
	}
}