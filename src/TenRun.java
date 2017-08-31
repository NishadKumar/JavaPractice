/*
 * Question: For each multiple of 10 in the given array, change all the values following
 *  it to be that multiple of 10, until encountering another multiple of 10.
 *   So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
Sample Input: 
1. tenRun({2, 10, 3, 4, 20, 5}) -> {2, 10, 10, 10, 20, 20} ,
2. tenRun({10, 1, 20, 2}) -> {10, 10, 20, 20} ,
Sample Output: 
3. tenRun({10, 1, 9, 20}) -> {10, 10, 10, 20}
 */
public class TenRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2, 10, 3, 4, 20, 5};
		int[] result = tenRun(nums);
		
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");

	}
	
	
	public static int[] tenRun(int[] nums)
	 {

	for(int i=0;i<nums.length-1;i++){
	  
	  if(nums[i]%10 == 0 && nums[i+1]%10!=0){
	       nums[i+1] = nums[i];
	    }
	  }

	return nums;
	 }

}
