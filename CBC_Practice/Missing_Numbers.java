package CBC_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Missing_Numbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> missing = new ArrayList<>();

        // Use an array to count the frequency of each number in the array
        int[] freq = new int[n+1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Traverse the frequency array to find the missing numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing.add(i);
            }
        }

        System.out.println(missing);
    }
}