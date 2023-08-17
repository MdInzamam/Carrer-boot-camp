package CBC_Recursion;

public class Print_feb {

	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		int n = 5;
		System.out.print(a+" ");
		System.out.print(b+" ");
		printFeb(a, b, n-2);
	}
	static void printFeb(int a, int b, int n) {
		if(n==0) {
			return;
		}
		int c= a+b;
		System.out.print(c+" ");
		printFeb(b,c,n-1);
	}
}
