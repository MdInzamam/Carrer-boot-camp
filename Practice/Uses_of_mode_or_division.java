package Practice;

public class Uses_of_mode_or_division {

	public static void main(String[] args) {
		int m = 16;
		int n = 16;
		int o = 10;
		System.out.println("16 == 16 -> "+(m == n));
		System.out.println("16 == 10 -> "+(m == o));
		System.out.println("16 != 16 -> "+(m != n));
		System.out.println("16 != 10 -> "+(m != o));
		
		int mod = n % 4;
		System.out.println("1 -> " + mod);
		
		int div = n / 4 ;
		System.out.println("2 -> " + div);

		
		if (n % 4 != 0) {
			System.out.println("3 -> " + n  );
		}
		
		
		if (n % 4 == 0) {
			System.out.println("4 -> " + n);
		}
		
		if (n / 4 == 0) {
			System.out.println("5 -> " + n);
		}
		System.out.println(powerOfFour(n));
	}
		public static boolean powerOfFour(int n) {
			if (n % 4 != 0) {
//				return true;
			}
			return false;
		}
}
