
public class NSquareRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long result = recursion_squareOf(121);
		System.out.println(result);

	}
	
	public static long recursion_squareOf(int n){
		
		if(n==1 || n==0)
			return n;
		
		return (recursion_squareOf(n-1) + 2*n-1);
		
	}

}
