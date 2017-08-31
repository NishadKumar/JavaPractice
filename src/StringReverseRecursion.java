/*
 * Reversing a string using recursion. For example: Nishad will be broken down to:
 * "ishad" + N
 *  shad + i + N
 *  had + s + i + N
 *  ad+ h + s + i + N
 *  d + a + h + s + i + N
 */
public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = recursive_Reverse("Arlington");
		System.out.println(result);
	}
	
	public static String recursive_Reverse(String str){
		if(str == null || str.length()<=1)
			return str;
		return recursive_Reverse(str.substring(1))+str.charAt(0);
	}
}
