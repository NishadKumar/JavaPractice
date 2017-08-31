import java.util.ArrayList;
import java.util.Arrays;

/*
 * Question: Pass an array of strings and an int as parameters. 
 * Remove all strings which has length equal to or greater than the int that
 *  is passed from the array and return the array.
Sample Input: {"Computer","Laptop","Recorder","Television","bottle",
"pen","pencil","Chip","mouse"} ,5->{"pen","chip"}
Sample Output: {Ram,krish,roop,nihar},4->{Ram}
Question Points: 10
 * 
 * 
 */
public class RemoveItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Computer","Laptop","Recorder","Television","bottle","pen","pencil","Chip","mouse"};
		int size= 5;
		
		String[] result = removeItems(str, size);
		System.out.println(Arrays.toString(result));
		

	}
	
	public static String[] removeItems(String[] str,int size){

		ArrayList<String> strings = new ArrayList<String>();
		for(int i=0;i<str.length;i++){
		   if(str[i].length()<size){
		     strings.add(str[i]);
		   }
		 }

		String[] result = new String[strings.size()];
		for(int i=0;i<strings.size();i++){
		   result[i] = strings.get(i);
		 }

		return result;
		}

}
