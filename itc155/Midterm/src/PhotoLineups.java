import java.util.Scanner;
import java.util.ArrayList;

/* Write a program that lists all ways people can line up for a photo(all permutations of a list of Strings).
 * The program will read a list of one word names(until-1),and use a recursive method to create and output 
 * all possible orderings of those names,one ordering per line. */

public class PhotoLineups {
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		if(nameList.size() == 2) {
			
		} else {
			for(int i = 0; i < nameList.size(); i++) {
				
			}
			allPermutations(permList, nameList);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;
		String stopRead = "-1";
		
		name = input.next();
		while(name != stopRead) {
			nameList.add(name);
			name = input.next();
		}
		input.close();
		
		allPermutations(permList, nameList);
		
	}

}
