/*
Given two strings, base and remove, return a version of the base string where all instances 
of the remove string have been removed (not case sensitive). 
You may assume that the remove string is length 1 or more. 
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x"
 */
public class StringWithoutSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = withoutString("This is a FISH!","IS");
		System.out.println(result);
	}
	
	public static String withoutString(String base, String remove) {
		  int remIdx = base.toLowerCase().indexOf(remove.toLowerCase());
		    if (remIdx == -1)
		        return base;
		    return base.substring(0, remIdx ) + 
		           withoutString(base.substring(remIdx + remove.length()) , remove);
		}
}
