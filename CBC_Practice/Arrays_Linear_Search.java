package CBC_Practice;

import java.util.*;

public class Arrays_Linear_Search {

	public static void main(String[] args) {
//		int[] arr = { 2, 4, 6, 9, 17 };
//		int target = 17;
//
//		int index = -1;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == target) {
//				index = i;
//				break;
//			}
//
//		}
//		System.out.print(index);
//	}
//
//}
		Scanner sc = new Scanner(System.in);

		// Read the size of the array
		int n = sc.nextInt();

		// Read the array elements
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == m) {
				index = i;
				break;
			}
		}
		System.out.print(index);
	}
}
