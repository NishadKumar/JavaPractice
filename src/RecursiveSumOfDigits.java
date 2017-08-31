/*
 * This is a recursive program to return sum of digits present in a number.
 */

public class RecursiveSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long result = recursiveSumOfDigits(1234567890);
		System.out.println(result);

	}
	
	public static long recursiveSumOfDigits(int number){
		
		if(number/10==0){
			return number;
		}
		
		return number%10+recursiveSumOfDigits(number/10);
	}

}
