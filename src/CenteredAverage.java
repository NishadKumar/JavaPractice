/*Question: Return the "centered" average of an array of ints, 
 * which we'll say is the mean average of the values, 
 * except ignoring the largest and smallest values in the array. 
 * If there are multiple copies of the smallest value, ignore just one copy, and likewise for the 
 * largest value. Use int division to produce the final average. 
 * You may assume that the array is length 3 or more.
Sample Input: 1. centeredAverage({1, 2, 3, 4, 100}) -> 3 ,
 2. centeredAverage({1, 1, 5, 5, 10, 8, 7}) -> 5 ,
Sample Output: 3. centeredAverage({10,4,2,4,2, 0}) -> 3
 * */
public class CenteredAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,5,5,10,8,7};
		int avg = centeredAverage(nums);
		System.out.println("The centered average is: "+avg);

	}
	
	public static int centeredAverage(int[] nums) {

		int min = nums[0] ,max = nums[0];
		int sum=0;
		int div = nums.length-2;
		int result = 0;

		for(int i=1;i<nums.length;i++){
		 if(nums[i]<min){
		    min = nums[i];
		  }
		}


		for(int i=0;i<nums.length;i++){
		 if(nums[i]>max){
		    max = nums[i];
		  }
		}

		for(int i=0;i<nums.length;i++){
		if(nums[i]!=max && nums[i]!=min){
		   sum+=nums[i];
		 }
		}
		result = sum/div;

		return result;  
		}
}
