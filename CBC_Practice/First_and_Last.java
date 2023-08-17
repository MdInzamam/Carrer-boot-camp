package CBC_Practice;

import java.util.*;

public class First_and_Last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int start = findStartIndex(arr, target);
		int end = findEndIndex(arr, target);
		if (start == -1 || end == -1) {
			System.out.println("-1 -1");
		} else {
			System.out.println(start + " " + end);
		}
	}

	public static int findStartIndex(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] >= target) {
				right = mid - 1;
				if (arr[mid] == target) {
					result = mid;
				}
			} else {
				left = mid + 1;
			}
		}
		return result;
	}

	public static int findEndIndex(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] <= target) {
				left = mid + 1;
				if (arr[mid] == target) {
					result = mid;
				}
			} else {
				right = mid - 1;
			}
		}
		return result;
	}
}