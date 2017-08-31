/*
Given a string, return true if the number of appearances of "is" anywhere in the
string is equal to the number of appearances of "not" 
anywhere in the string (case sensitive).

equalIsNot("This is not") = false
equalIsNot("This is notnot") = true
equalIsNot("noisxxnot yynotxisi") = true
 */
public class IsNotCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isNotEquals("ThIs is notnot");
		System.out.println(result);

	}
	
	public static boolean isNotEquals(String str){
		
		int isCounter = 0, notCounter = 0;
		
		isCounter = str.toLowerCase().split("is",-1).length-1;
		notCounter = str.toLowerCase().split("not",-1).length-1;
		
		if(isCounter == notCounter)
			return true;
		
		return false;	
	}

}
