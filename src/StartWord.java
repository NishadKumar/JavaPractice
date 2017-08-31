/*
Question: Given a string and a second "word" string, we'll say that the word matches the string if it 
appears at the front of the string, except its first char does not need to match exactly. 
On a match, return the front of the string, or otherwise return the original string. 
So, with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
The word will be at least length 1.
Sample Input: 1. startWord("hippo", "hi") -> hi , 2. startWord("hippo", "xip") -> hip
Sample Output: 3. startWord("hippo", "i") -> h 
*/
public class StartWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = startWord("Hippo", "Xip");
		System.out.println(result);
	}
	
	public static String startWord(String str, String word) {

		String result="";
		char first = str.charAt(0);
		for(int i=1;i<word.length();i++){
		 if(word.charAt(i) == str.charAt(i)){
		    result+=word.charAt(i);
		  }else{
		   return str;
		  }
		}

		return first+result;
		  
		}


}
