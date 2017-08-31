
public class IsBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result1 = isBinary(1001);
		boolean result2 = isBinary(1234);
		boolean result3 = isBinary(00100002);
		boolean result4 = isBinary(0000000);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

	public static boolean isBinary(int number){
		
		int temp = number;
		boolean result = true;
		while(temp!=0){
			int digit = temp%10;
			if(digit>1){
				result = false;
				break;
			}else{
				temp = temp/10;
			}
		}
		if(result){
			return true;
		}
		return false;
		
	}
	
}
