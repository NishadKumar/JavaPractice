/*
 * Given a string, return the longest substring that appears at both the
 *  beginning and end of the string without overlapping. 
 *  For example, sameEnds("abXab") is "ab".
sameEnds("abXYab") = "ab"
sameEnds("xx") = "x"
sameEnds("xxx") = "x"
 */
public class SameStartEndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = sameEnds("Hello! and Hello!");
		System.out.println(result);

	}
	
	public static String sameEnds(String string) {
		  
		  int start = (int)Math.ceil((double)string.length()/2);
		    int end = string.length() / 2;
		      
		    for(int i = 0; i < string.length() / 2; i++) {
		        if(string.substring(0, end).equals(string.substring(start))) {
		            return string.substring(0, end);
		        } else {
		            start++;
		            end--;
		        }
		    }
		                                          
		    return "";
		}


}
