import java.util.Arrays;


public class ArrayReverseRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,7,3,1,5,9,0};
		int[] result = reverseArrayRecursive(arr);
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] reverseArrayRecursive(int[] x){
		
		reverse(x,0,x.length-1);
		return x;
		
	}
	
	public static void reverse(int[] x,int i,int j){
		
		if(i<j){
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			reverse(x,++i,--j);
		}
	}

}
