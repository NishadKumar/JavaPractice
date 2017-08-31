import java.util.ArrayList;


public class AntakshariWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Java");
		words.add("excel");
		words.add("android");
		words.add("logo");
		words.add("dbase");
		
		ArrayList<String> result = anthaksharyOfWords(words);
		System.out.println(result.toString());

	}

	
	public static ArrayList<String> anthaksharyOfWords(ArrayList<String> words){

		ArrayList<String> list = new ArrayList<String>();

		String newWord = words.get(0);

		list.add(newWord);

		  for(int i=1;i<words.size();i++){
		     for(int j=0;j<words.size();j++){
		      if(newWord.charAt(newWord.length()-1) == words.get(j).charAt(0)){
		          list.add(words.get(j));
		          newWord = words.get(j);
		          break;
		       }
		    }
		 }
		  return list;
	}
}
