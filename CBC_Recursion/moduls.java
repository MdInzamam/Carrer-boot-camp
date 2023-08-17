package CBC_Recursion;

public class moduls {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(reverse(n));

	}
	public static int reverse(int n) {
		if(n==0) {
			return 1;
		}
		int i = reverse(n-1);
		return n*i;
		
	}
}
