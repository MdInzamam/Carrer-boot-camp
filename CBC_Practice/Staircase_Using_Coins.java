package CBC_Practice;

import java.util.Scanner;

public class Staircase_Using_Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long i = 1;
		while (i * (i + 1) / 2 <= n) {
			i++;
		}
		System.out.println(i - 1);
	}
}