/*
 * Question: Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
Sample Input: 1. stringX("xxHxix") -> "xHix" , 
2. stringX("abxxxcd") -> "abcd" ,
Sample Output: 3. stringX("xabxxxcdx") -> "xabcdx"

 */
public class StringWithoutX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = stringX("axxChixcd");
		System.out.println(result);

	}
	
	public static String stringX(String str) {
		
		String temp = str.charAt(0)+"";
		for(int i=1;i<str.length()-1;i++){
			if(str.charAt(i)!='x'){
				temp = temp+str.charAt(i);
			}
		}
		return temp+str.charAt(str.length()-1);
	}

}
