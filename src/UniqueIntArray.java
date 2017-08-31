import java.util.ArrayList;


public class UniqueIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,76,54,33,12,78,44,5,3,89,98,2,1,1,6,55,78};
		int[] result = makeUniQueElementArray(arr);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");

	}
	
	public static int[] makeUniQueElementArray(int[] a)
	{

		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i=0;i<a.length;i++)
		{
			if(!(al.contains(a[i]))){
				al.add(a[i]);
			}
		}

		int[] b = new int[al.size()];
		for(int i=0;i<al.size();i++){
			b[i] = al.get(i);
		}

		return b;
	}

}
