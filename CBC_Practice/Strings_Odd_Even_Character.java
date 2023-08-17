package CBC_Practice;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		char[] str = ch.toCharArray();

		for (int i = 0; i <= str.length - 1; i++) {
//			System.out.print(str[i]);
			if (i % 2 == 0) {
				str[i] += 1;
				System.out.print(str[i]);
			}
			else {
				str[i] -= 1;
				System.out.print(str[i]);
			}

		}
	}

}
