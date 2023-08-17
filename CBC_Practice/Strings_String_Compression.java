package CBC_Practice;

import java.util.Scanner;

public class Strings_String_Compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(compress(str));
	}

	public static String compress(String str) {
		int len = str.length();
		if (len == 0) {
			return str;
		}

		char[] comp = new char[len];
		int index = 0;
		char prev = str.charAt(0);
		int count = 1;
		for (int i = 1; i < len; i++) {
			char curr = str.charAt(i);
			if (curr == prev) {
				count++;
			} else {
				index = append(comp, index, prev, count);
				prev = curr;
				count = 1;
			}
		}
		index = append(comp, index, prev, count);

		if (index >= len) {
			return str;
		} else {
			char[] result = new char[index];
			System.arraycopy(comp, 0, result, 0, index);
			return new String(result);
		}
	}

	public static int append(char[] arr, int index, char c, int count) {
		arr[index++] = c;
		if (count > 1) {
			int num = count;
			int div = 1;
			while (num / div >= 10) {
				div =div * 10;
			}
			while (div > 0) {
				arr[index++] = (char) ('0' + (num / div));
				num = num % div;
				div = div / 10;
			}
			arr[index++] = (char) ('0' + num);
		}
		return index;
	}
}