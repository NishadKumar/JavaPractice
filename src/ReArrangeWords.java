import java.util.ArrayList;


public class ReArrangeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		words.add("nishad1");
		words.add("nish");
		words.add("nis");
		words.add("nishad2");
		
		
		ArrayList<String> result = reArrangeWords(words);
		for(String s:result)
			System.out.print(s+" ");

	}

	
	public static ArrayList<String> reArrangeWords(ArrayList<String> words){

		ArrayList<String> noNums= new ArrayList<String>();
		ArrayList<String> withNums= new ArrayList<String>();
		
		for(String s: words){
			if(s.matches(".*[0-9].*")){
				withNums.add(s);
			}else{
				noNums.add(s);
			}
		}
		
		noNums.addAll(withNums);
		return noNums;
	}
}
