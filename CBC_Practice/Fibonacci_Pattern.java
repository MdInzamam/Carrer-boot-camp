package CBC_Practice;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		fab(n);
	}
	public static void fab(int n) {
		int low = 0, mid = 1, count = 0;			
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(low+" ");
				int sum = mid + low;
				low = mid;
				mid = sum;
			}
			System.out.println();
		}
	}
}
