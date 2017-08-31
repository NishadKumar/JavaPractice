
public class UniqueStringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isStringUnique("Malay");
		System.out.println(result);

	}
	
	public static boolean isStringUnique(String s){

		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i) == s.charAt(j)){
					return false;
				}
			}
		}
			return true;
	}


}
