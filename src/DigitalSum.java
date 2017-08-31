
public class DigitalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = digitalSum(762472376);
		//int result = 0;
		while(sum>=10){
			sum = digitalSum(sum);
		}
		System.out.println("Absolute digital sum is "+sum);
		
	}


	public static int digitalSum(int num){
		int sum = 0;
		int digit = 0;
		
		while(num!=0){
			digit = num%10;
			sum+=digit;
			num/=10;
		}
		
		return sum;
		
	}
}
