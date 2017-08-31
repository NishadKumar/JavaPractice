/*
 * Generating fibonacci sequence upto a given integer. 
 * Fib(4) = 0 1 1 2 
 * Fib(7) = 0 1 1 2 3 5 8  
 * Fib(10) = 0 1 1 2 3 5 8 13 21 34  
 */
public class GenerateFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = generateFibonacci(10);
		System.out.println(result);
		
	}

	public static String generateFibonacci(int n) {
		// TODO Auto-generated method stub
		String result = "";
		for(int i=1;i<=n;i++){
			result+=fib(i)+" ";
		}
		return result;
	}

	public static int fib(int n) {
		// TODO Auto-generated method stub
		if(n-1==0)
			return 0;
		if(n-1 == 1)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}

}
