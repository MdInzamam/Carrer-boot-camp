package Practice;

import java.util.*;

public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] ugly = new int[n];
//		ugly[0] = 1;
//		int i2 = 0, i3 = 0, i5 = 0;
//		int num2 = 2, num3 = 3, num5 = 5;
//		for (int i = 1; i < n; i++) {
//			int nextUgly;
//			if (num2 <= num3 && num2 <= num5) {
//				nextUgly = num2;
//				i2++;
//				num2 = ugly[i2] * 2;
//			} else if (num3 <= num2 && num3 <= num5) {
//				nextUgly = num3;
//				i3++;
//				num3 = ugly[i3] * 3;
//			} else {
//				nextUgly = num5;
//				i5++;
//				num5 = ugly[i5] * 5;
//			}
//			ugly[i] = nextUgly;
////			System.out.print(ugly[i]+" ");
//		}
//		System.out.println(ugly[n - 1]);
//	}
//}

//		 public static int NthNumber(int n) {
//		        int[] nth_Num = new int[n];
//		        nth_Num[0] = 1;
//		        int x = 0;
//		        int y = 0;
//		        int z = 0;
//		        int num2 = 2, num3 = 3, num5 = 5;
//		        for (int i = 1; i < n; i++) {
//		            int next_num = Math.min(num2, Math.min(num3, num5));
//		            nth_Num[i] = next_num;
//		            if (next_num == num2) {
//		                x++;
//		                num2 = nth_Num[x] * 2;
//		            }
//		            if (next_num == num3) {
//		                y++;
//		                num3 = nth_Num[y] * 3;
//		            }
//		            if (next_num == num5) {
//		                z++;
//		                num5 = nth_Num[z] * 5;
//		            }
//		        }
//		        return nth_Num[n-1];
//		    }
//		    
//		 public static void main(String[] args) {
//		        Scanner scanner = new Scanner(System.in);
//		        int n = scanner.nextInt();
//		        System.out.println(NthNumber(n));
//		    }
//		}
//
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int min_num = 0;
//		int max_num = n - 1;
//		for (int i = 0; i < n; i++) {
//			if (arr[i] < arr[min_num]) {
//				min_num = i;
//			}
//			if (arr[i] > arr[max_num]) {
//				max_num = i;
//				System.out.println(max_num);
//			}
//		}
//
//		if (min_num == 1 && max_num == n - 1) {
//			System.out.println("-1");
//		} else {
//			int i = 0;
//			while (i < n && arr[i] == arr[min_num]) {
//				i++;
//			}
//			int j = n - 1;
//			while (j >= 0 && arr[j] == arr[max_num]) {
//				j--;
//			}
//			System.out.println((i + 1) + " " + (j + 1));
//		}
//	}
//}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[2*n];
//		for (int i = 0; i < 2*n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		int[] arr = arrayShuffle(nums, n);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//
//	public static int[] arrayShuffle(int[] nums, int n) {
//		int[] new_array = new int[2 * n];
//		int i = 0;
//		for (int j = 0; j < n; j++) {
//			new_array[i] = nums[j];
//			new_array[i + 1] = nums[j + n];
//			i = i + 2;
//		}
//		return new_array;
//	}
//}
//	
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] leaders = findLeaders(arr);
//        for (int i = 0; i < leaders.length; i++) {
//            System.out.print(leaders[i] + " ");
//        }
//    }
//    
//    public static int[] findLeaders(int[] arr) {
//        int[] leaders = new int[arr.length];
//        int maxSoFar = arr[arr.length-1];
//        int count = 0;
//        for (int i = arr.length-2; i >= 0; i--) {
//            if (arr[i] > maxSoFar) {
//                leaders[count++] = arr[i];
//                maxSoFar = arr[i];
//            }
//        }
//        int[] result = new int[count+1];
//        for (int i = 0; i < count; i++) {
//            result[i] = leaders[count-i-1];
//            System.out.println(result[i]+"*");
//        }
//        result[count] = arr[arr.length-1];
//        System.out.println(result[count]+"*");
//        return result;
//    }
//}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		int x = 0;
//		int y = 0;
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == '(') {
//				x++;
//			} else {
//				y++;
//			}
//			if (y > x) {
//				x = 0;
//				y = 0;
//			} else if (x == y) {
//				count = Math.max(count, 2 * y);
//			}
//		}
//
//		x = 0;
//		y = 0;
//		for (int i = str.length() - 1; i >= 0; i--) {
//			if (str.charAt(i) == '(') {
//				x++;
//			} else {
//				y++;
//			}
//			if (x > y) {
//			x = 0;
//			y = 0;
//			} else if (x == y) {
//				count = Math.max(count, 2 * x);
//			}
//		}
//
//		System.out.println(count);
//	}
//}

//	

//	
//	  public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        int n = sc.nextInt();
//	        int[] arr = new int[n];
//	        for (int i = 0; i < n; i++) {
//	            arr[i] = sc.nextInt();
//	        }
//	        int[] dp = new int[n];
//	        int ans = 0;
//	        for (int i = 1; i <= n-1; i++) {
//	            if (arr[i] > arr[i-1]) {
//	                dp[i] = 0;
//	            } else if (arr[i] == arr[i-1]) {
//	                dp[i] = dp[i-1];
//	            } else {
//	                int len = dp[i-1];
//	                if (i-len-1 >= 0 && arr[i] == arr[i-len-1]-1) {
//	                    dp[i] = dp[i-1]+1;
//	                } else {
//	                    dp[i] = 0;
//	                }
//	            }
//	            ans += dp[i];
//	        }
//	        ans += n; // add the single day smooth descent periods
//	        System.out.println(ans);
//	    }
//	}
	
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int num = arr[n - 1];
//        System.out.print(num + " ");
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] > num) {
//            	num = arr[i];
//                System.out.print(num + " ");
//            }
//        }
//    }
//}
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] prices = new int[n];
	        for (int i = 0; i < n; i++) {
	            prices[i] = sc.nextInt();
	        }
	        sc.close();

	        int count = n; // every single day is a smooth descent period
	        for (int i = 0; i < n - 1; i++) {
	            int j = i + 1;
	            while (j < n && prices[j] == prices[j-1] - 1) {
	                count++;
	                j++;
	            }
	        }
	        System.out.println(count);
	    }
	}