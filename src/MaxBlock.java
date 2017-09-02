
public class MaxBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = maxBlock("abbCCCddBBBxx");
		System.out.println(result);
	}

	
	public static int maxBlock(String str) {

		  int len = str.length();
		  int count = 0;
		  int tmpcount = 1;		  
		  if (len == 0)
		    return 0;
		  for (int i = 0; i < len; i++) {
		    if (i < len-1 && str.charAt(i) == str.charAt(i+1))
		      tmpcount++;
		    else
		      tmpcount = 1;
		    if (tmpcount > count)
		      count = tmpcount;
		  }
		  return count;
		}
}
