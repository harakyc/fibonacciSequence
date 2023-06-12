/**
 * Fibonacci Program Using Recursive Method and Time Calculation in Nanoseconds.
 * Fibonacci series: 0 1 1 2 3 5 8 13 21 34 ...
 * @author hariklia kycyku
 * 
 */



public class RFibonacci {
	
	public static void main(String[] args) {
		
		System.out.print("Input\tIterative\tRecursive\n");
		System.out.print("-----\t---------\t---------\n");
		
		long startTime, endTime;
		long tdifference1, tdifference2;
		int n = 7;
		long f1, f2;
		
		for(int i = 3; i <= n; i++) {
			startTime = System.nanoTime();
			f1 = fibonacci(i);
			endTime = System.nanoTime();
			tdifference1 =  endTime - startTime;
			startTime = System.nanoTime();
			f2 = fibonacciIterative(i);
			endTime = System.nanoTime();
			tdifference2 = endTime - startTime;
			System.out.print(i+"\t"+tdifference1+"\t\t"+tdifference2 +"\t\n");
		}
		
	}
	private static long fibonacci(int n) {
		
		
		/**
		 * Recursive Implementation 
		 * Time Complexity: O(n)
		 * 
		 * 
		 * @param n
		 * @return
		 * 
		 */
		
		
		if (n <= 1) {    //
			return n;
		}
		else {
			long result =  (fibonacci(n-1) + fibonacci(n-2));
			return result;		
		}
	}
public static int fibonacciIterative(int n) {
		
		/**
		 *Iterative Implementation 
		 * Time Complexity: O(n)
		 * 
		 * 
		 * @param n
		 * @return
		 * 
		 */
		
		
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
}

