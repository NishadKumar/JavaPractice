/*
 * Question: Return true if the group of N numbers at the start and 
 * end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, 
 * the ends are the same for n=0 and n=2, and false for n=1 and n=3. 
 * You may assume that n is in the range 0..nums.length inclusive.
Sample Input: 1. sameEnds({5, 6, 45, 99, 13, 5, 6}, 1) -> false , 
2. sameEnds({5, 6, 45, 99, 13, 5, 6}, 2)-> true ,
Sample Output: 3. sameEnds({5, 6, 45, 99, 13, 5, 6}, 3)-> false

 */
public class SameEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5, 6, 45, 99, 13, 5, 6};
		int len = 1;
		
		boolean result = sameEnds(nums, len);
		
		System.out.println(result);

	}
	
	public static boolean sameEnds(int[] nums, int len) {

		boolean result = true;

		for(int i=0,j=nums.length-len;i<len;i++,j++){
		   if(nums[i] == nums[j]){
		    continue;
		   }else{
		     result = false;
		     break;
		   }
		 }

		return result;
		}

}
