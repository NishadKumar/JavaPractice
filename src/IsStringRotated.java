
public class IsStringRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isStringRotated("hello","ohell");
		if(result){
			System.out.println("Strings are rotation of each other.");
		}else{
			System.out.println("Strings are not rotation of each other.");
		}

	}
	
	public static boolean isStringRotated(String s1, String s2) {
		if((s1+s1).contains(s2)){
			return true;
		}
		return false;
	}

}
