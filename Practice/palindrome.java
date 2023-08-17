package Practice;

public class palindrome {
	public static void main(String[] args) {
		int n = 1221;
//		int j = isPalindrome;
		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int reverse = 0;
		while (n != 0) {
			int reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;
		}
		if(temp == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
}
