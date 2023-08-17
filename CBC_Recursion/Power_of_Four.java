package CBC_Recursion;

public class Power_of_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(powerOfFour(n));

	}

	public static boolean powerOfFour(int n) {
		if (n == 1) {
			return true;
		}
		if (n < 1) {
			return false;
		}
		if (n % 4 != 0 ) {
			return false;			
		}
		return powerOfFour(n / 4 );
			
	}

}
