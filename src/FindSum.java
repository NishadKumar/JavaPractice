/*
 * Question: Pass an int as parameter.Ex:cba as input. If it contains 3 digits, 
 * the returned value should be a+ b*b + c*c*c where a is the units, b is the tens and 
 * c is the third digit. Be careful of overflow here. 234-->4+3*3+2*2*2 = 21
Sample Input: 123
Sample Output: 3+2*2+1*1*1=8

 */
public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = findSum(452);
		System.out.println(sum);

	}
	
	public static int findSum(int num){

		int sum = 0;
		int digit = 0;
		int i=1;

		while(num!=0){
		    digit = num%10;
		    num = num/10;
		    sum+=(int)Math.pow(digit,i);
		    i++;
		  }

		return sum;
		}

}
