import java.util.*;

public class Exercise_10_3 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("This", "is", "a", "test"));
		System.out.println(words);
		removeEvenLength(words);
	}
	
	public static void removeEvenLength(ArrayList<String> word){
	    for(int i = word.size() - 1; i >= 0; i--){
	        if(word.get(i).length() % 2 == 0){
	            word.remove(i);
	        }
	    }
	    System.out.println(word);
	}
}
