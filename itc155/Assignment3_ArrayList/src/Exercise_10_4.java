import java.util.*;

public class Exercise_10_4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("how");
		list.add("are");
		list.add("you?");
		System.out.println(list);
		doubleList(list);
		System.out.print(list);
	}
	
	public static void doubleList(ArrayList<String> words){
	    for(int i = 0; i < words.size(); i+=2){
	        words.add(i + 1, words.get(i));
	    }   
	}
}
