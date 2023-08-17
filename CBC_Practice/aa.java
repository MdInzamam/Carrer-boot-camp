package CBC_Practice;

import java.util.*;

public class aa {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        long[] arr = new long[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int[] output = getProductExceptSelf(arr);
	        for (int i = 0; i < n; i++) {
	            System.out.print(output[i] + " ");
	        }
	    }

	    public static int[] getProductExceptSelf(long[] arr) {
	        long n = arr.length;
	        int[] output = new int[(int) n];
	        int product = 1;
	        for (int i = 0; i < n; i++) {
	            product *= arr[i];
	        }
	        for (int i = 0; i < n; i++) {
	            output[i] = (int) (product / arr[i]);
	        }
	        return output;
	    }
	}