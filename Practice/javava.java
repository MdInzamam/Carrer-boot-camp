package Practice;
import java.util.*;
public class javava {

	public static void main(String[] args) {
//		fun(3);
//	}
//	public static void fun(int n) {
//		if(n==0) {
//			return;
//		}
////		System.out.println(n);
//		fun(n-1);
//		System.out.println(n);
//	}
//
//}
		        Scanner scanner = new Scanner(System.in);

		        int N = scanner.nextInt(); // Number of books
		        int T = scanner.nextInt(); // Total free time

		        int[] bookTimes = new int[N];
		        for (int i = 0; i < N; i++) {
		            bookTimes[i] = scanner.nextInt(); // Reading time for each book
		        }

		        int maxBooks = getMaxBooks(N, T, bookTimes);
		        System.out.println(maxBooks);
		    }

		    private static int getMaxBooks(int N, int T, int[] bookTimes) {
		        int left = 0; // Left pointer of the window
		        int right = 0; // Right pointer of the window
		        int totalTime = 0; // Current total time spent reading books
		        int maxBooks = 0; // Maximum number of books Valera can read

		        while (right < N) {
		            totalTime += bookTimes[right]; // Include the current book time
		            while (totalTime > T) {
		                totalTime -= bookTimes[left]; // Remove books from the left until totalTime <= T
		                left++;
		            }

		            maxBooks = Math.max(maxBooks, right - left + 1); // Update maxBooks

		            right++; // Move the right pointer to consider the next book
		        }

		        return maxBooks;
		    }
		}
