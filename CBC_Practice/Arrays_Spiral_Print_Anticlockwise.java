package CBC_Practice;

import java.util.*;

public class Arrays_Spiral_Print_Anticlockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		char[] str = ch.toCharArray();
		int a = str.length / 2;
//		System.out.print(a);

		for (int j = 0; j < 2 * a; j++) {
			if (str[j] != str[j + 1]) {
				System.out.print(str[j]);
			}
		}
	}
}
//123		124
//456		753
//789		689