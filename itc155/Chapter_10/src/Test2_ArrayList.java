import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test2_ArrayList{
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("words.txt"));
		while (input.hasNext()) {
	        String word = input.next();
	        allWords.add(word);
	    }
		
		input.close();
	
	    System.out.println(allWords);
	    
	    System.out.println();        
	    // remove all plural words
	    for (int i = 0; i < allWords.size(); i++) {
	        String word = allWords.get(i);
	        if (word.endsWith("s")) {
	            allWords.remove(i);
	            i--;
	        }
	    }
	}
}


