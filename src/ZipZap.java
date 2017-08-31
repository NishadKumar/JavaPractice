/*
 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
 *  and ending with 'p'. Return a string where for all such words, the middle letter is gone,
 *   so "zipXzap" yields "zpXzp".
Sample Input: 1. zipZap("zipXzap") -> "zpXzp" , 2. zipZap("zopzop") -> "zpzp" ,
Sample Output: 3. zipZap("zzzopzop") -> "zzzpzp"
 * 
 */
public class ZipZap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = zipZap("zzzopzop");
		System.out.println(result);

	}
	
	public static String zipZap(String str) {
		String result = "";
		for(int i=0;i<str.length();i++){
		  if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
		    result+=str.charAt(i)+""+str.charAt(i+2);
		    i+=2;
		  }else{
		    result+=str.charAt(i)+"";
		  }
		}
		return result; 
		}
					


}
