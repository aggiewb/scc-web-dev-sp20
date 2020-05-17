import java.util.Scanner;
import java.util.ArrayList;

/* Write a program that lists all ways people can line up for a photo(all permutations of a list of Strings).
 * The program will read a list of one word names(until-1),and use a recursive method to create and output 
 * all possible orderings of those names,one ordering per line. */

public class PhotoLineups {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		
		System.out.print("Enter a list of names, and enter -1 at the end of the list to quit: ");
		String name = input.next();
		nameList.add(name);
		
		while(!input.hasNextInt()) {
			name = input.next();
			nameList.add(name);
		}
		
		input.close();
		
		allPermutations(permList, nameList);
	
	}
	
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		if(nameList.size() == 2) {
			
		} else {
			for(int i = 0; i < nameList.size(); i++) {
				nameList.remove(i);
				allPermutations(permList, nameList);
				permList.add(i, nameList.get(i));
			}
		}

	}

}
