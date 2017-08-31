
public class MaxOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {98,75,96,47,65};
		int[] arr2 = {71,55,82,670,66};
		int max = findMaximumAcrrossArrays(arr1, arr2);
		System.out.println(max);
	}

	
	public static int findMaximumAcrrossArrays(int[] arr1,int[] arr2){

		int max1 = arr1[0];
		int max2 = arr2[0];
		for(int i=1;i<arr1.length;i++){
		  if(arr1[i]>=max1){
		     max1 = arr1[i];
		   }
		 }
		System.out.println(max1);
		for(int i=1;i<arr2.length;i++){
		  if(arr2[i]>=max2){
		     max2 = arr2[i];
		   }
		 }
		System.out.println(max2);
		return Math.max(max1,max2);


		}
}
