import java.util.ArrayList;

public class CopyEvens{
	
	public static void main(String[] args){
		
		 int[] nums = {3,2,5,8,16,3,7,8};
		 int count = 3;
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 int[] temp = new int[count];
			int j = 0;
			
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i]%2 == 0 && count > 0)
				{
					temp[j] = nums[i];
					++j;
					--count;
				}
			}
			
			for(int i =0;i<temp.length;i++){
				System.out.print(temp[i]);
				System.out.print(" ");
			}
				
	}
	
}