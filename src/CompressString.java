/*
 * Question: Perform basic string compression using counts of repeated characters.
 *  (If the compressed string is larger than or equal to the orginal string(in length) then
 *   the original string should be returned) Eg: i/p : aaaaccccbbbhhhjj o/p : a4c4b3h3j2
Sample Input: 1)aaaaccccbbbhhhjj ->a4c4b3h3j2 2)Wfoog ->Wfoog
Sample Output: 3.aaavfff->a3v1f3

 */
public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = compressString("aaaaccccbbbhhhjj");
		System.out.println(result);

	}
	
	public static String compressString(String s) {

		String str = "";
		int k=1;

		for(int i=0;i<s.length();i++){
		   if(i!=(s.length()-1) && s.charAt(i) == s.charAt(i+1)){
		      k++;
		    }else{
		      str+=s.charAt(i);
		      str+=k;
		      k=1;
		    }
		 }

		if(str.length()>=s.length()){
		  return s;
		}
		return str;


		}

}
