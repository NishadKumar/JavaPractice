
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = fibonacci(10);
		System.out.println(result);
	}

	public static int fibonacci(int n) {
		// TODO Auto-generated method stub
		
		if(n==0)
			return 0;
		if(n==1) 
			return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
