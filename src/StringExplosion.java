/*
 *  Exploding a given string: For example, Code ---> CCoCodCode
 */
public class StringExplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String result = stringExplosion("Code");		
		System.out.println(result); 
	}
	
	public static String stringExplosion(String str) {
		  String result = "";
		  int j = 1;
		   while(j<=str.length()){
		     result+=str.substring(0,0+j);
		     j++;
		  }
		return result;
		}
}
