import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayReverseRecursiveTest {

	@Test
	public void testReverse() {
		//ArrayReverseRecursive test = new ArrayReverseRecursive();
		int[] arr = {4,7,3,1,5,9,0};
		int[] output = ArrayReverseRecursive.reverseArrayRecursive(arr);
		assertArrayEquals(new int[]{0,9,5,1,3,7,4},output);
	}
	
	@Test
	public void testReverseWithEvenLength() {
		//ArrayReverseRecursive test = new ArrayReverseRecursive();
		int[] arr = {1,2,3,4,5,6,7,8};
		int[] output = ArrayReverseRecursive.reverseArrayRecursive(arr);
		assertArrayEquals(new int[]{8,7,6,5,4,3,2,1},output);
	}

}
