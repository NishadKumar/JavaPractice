/*Question: Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
Sample Input: 1. zeroMax({0, 5, 0, 3}) -> {5, 5, 3, 3} 2. zeroMax({0, 4, 0, 3}) -> {3, 4, 3, 3}
Sample Output: 3.zeroMax({0, 1, 0}) -> {1, 1, 0}
 */
public class ZeroMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,4,0,3};
		arr = zeroMax(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		    System.out.print(" ");
		    }

	}
	
	public static int[] zeroMax(int[] nums) {

		for(int i=0;i<nums.length;i++)
			  {
				  int max=0;
				  if(nums[i]==0)
				  {
					 for(int j=i+1;j<nums.length;j++)
					 {
						 if(nums[j]%2==1)
						 {
							 max=Math.max(max, nums[j]);
						 }
						 
					 }
					 nums[i]=max;
				  }
				  
				  
			  }
			  return nums;
		  
		}

}


