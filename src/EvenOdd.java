/*
Question: Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
You can make a new array and return it.Note:Retain the order of other elements.
Sample Input: 1. evenOdd({1, 0, 1, 0, 0, 1, 1}) -> {0, 0, 0, 1, 1, 1, 1} 
2. evenOdd({3, 3, 2})->{2, 3, 3}
Sample Output: 3. evenOdd({2, 2, 2}) -> {2, 2, 2}
*/
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 0, 1, 0, 0, 1, 1};
		int[] res = evenOdd(nums);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}

	}
	
	public static int[] evenOdd(int[] nums) {
		
		int[] res = new int[nums.length];
		int k=0;
		for(int i=0;i<nums.length;i++){
		  if(nums[i] %2 == 0){
		     res[k] = nums[i];
		     k++;
		   }
		 }

		for(int i=0;i<nums.length;i++){
		  if(nums[i] %2 != 0){
		     res[k] = nums[i];
		     k++;
		   }
		 }

		
		  return res;
		}
}
