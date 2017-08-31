/*
 * Finding HCF of 2 given numbers recursively.
 */

public class FindHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = hcfOf2Numbers(108,56);
		System.out.println(result);
		

	}

	public static int hcfOf2Numbers(int first, int second) {
		// TODO Auto-generated method stub
		if(first==0 ||second==0)
			return first+second;
		
		if(first>second)
			return hcfOf2Numbers(first-second, second);
		
		return hcfOf2Numbers(second-first, first);
	}

}
