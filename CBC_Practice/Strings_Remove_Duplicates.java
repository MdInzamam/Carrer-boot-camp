package CBC_Practice;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(removeDuplicat(str));

	}
	public static String removeDuplicat(String str) {
		String s = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(i==0 || ch!=str.charAt(i-1)) {
				s += ch;
			}
		}
		return s;
	}

}
