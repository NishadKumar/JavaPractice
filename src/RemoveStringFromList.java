import java.util.ArrayList;


public class RemoveStringFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Book");
		arr.add("dsgdfsgd");
		arr.add("sdfgfd");
		arr.add("sdfgfsdgdfgsd");
		arr.add("Cars");

		ArrayList<String> result = removeStringFromList(arr, 7);
		System.out.println(result.toString());
	}
	
	public static ArrayList<String> removeStringFromList(ArrayList<String> arr,int n){

		ArrayList<String> list = new ArrayList<String>();

		  for(int i=0;i<arr.size();i++){
		    if(arr.get(i).length()<n){
		      list.add(arr.get(i));
		    }
		  }

		return list;
		}

}
