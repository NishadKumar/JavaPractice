
public class TwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,2,2,1,2,4};
		
		boolean result = twoTwo(nums);
		System.out.println(result);

	}
	
	public static boolean twoTwo(int[] nums) {


		if(nums[nums.length-1]==2){
		return false;
		}
		for(int i=0;i<nums.length;i++){
		    if(nums[i]==2 && nums[i+1]==2){
		       return true;
		     }
		  }

		return false;
		}


}
