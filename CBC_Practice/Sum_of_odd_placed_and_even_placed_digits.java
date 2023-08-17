package CBC_Practice;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getsum(n);

	}

	public static void getsum(int n) {
		int sum1 = 0;
		int sum2 = 0;
		int j = 1;
		int rem = 0;
		while (n != 0) {
			rem = n % 10;
			if (j % 2 == 0) {
				sum1 += rem;
			} else {
				sum2 += rem;
			}
			n /= 10;
			j++;
		}
		System.out.println(sum2);
		System.out.println(sum1);
	}
}
