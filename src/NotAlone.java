/*
Question: We'll say that an element in an array is "notalone" if there are values before and after it, and those values are different from it.
Return a version of the given array where every instance of the given value which is notalone is replaced by whichever value to its left or right is larger.
Sample Input: 1. notAlone({1, 2, 3}, 2) -> {1, 3, 3} , 
2. notAlone({1, 2, 3, 2, 5, 2}, 2)->{1, 3, 3, 5, 5, 2} ,
Sample Output: 3. notAlone({3, 4}, 3) -> {3, 4}
*/
public class NotAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,2,5,2};
		int[] result = notAlone(nums,2);
		for(int i =0;i<result.length;i++)
			System.out.print(result[i]+" ");

	}
	
	public static int[] notAlone(int[] nums, int val)
	{
	  for(int i=0;i<nums.length;i++){
	    if((i-1)>=0 && (i+1)<nums.length){
	     if((nums[i] == val) && (nums[i-1]!=val) && (nums[i+1]!=val)){
	        if(nums[i-1]>nums[i+1]){
	         nums[i] = nums[i-1];
	        }else{
	         nums[i] = nums[i+1];
	        }
	      }
	    }
	  }
	return nums;
	}


}
