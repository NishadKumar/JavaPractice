/*
 * Question: Pass 2 strings as input. Find out how many times does the second param
 *  occur in the first one (number of occurances) and return the count.
Sample Input: AAbcAbcAbcc, Abc ->3 xyzasxyz,xy->2
Sample Output: catcatrat,at->3
Question Points: 10
 * 
 * */

public class FindNumOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = findNumOfOccurances("Xxxxynnxzzzbbysuuundndxx8wkjsdxxxaxx","xx");
		System.out.println(result);
	}
	
	public static int findNumOfOccurances(String input,String matcher){
		int count = 0;
		for(int i=0;i<input.length();i++){
		   if(input.startsWith(matcher,i)){
		    count++;
		   }
		 }

		return count;
		  
		}

}
