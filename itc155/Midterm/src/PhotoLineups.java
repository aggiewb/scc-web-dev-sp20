import java.util.Scanner;
import java.util.ArrayList;

/* Write a program that lists all ways people can line up for a photo(all permutations of a list of Strings). 
 * The program will read a list of one word names(until-1), and use a recursive method to create and output 
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
		for(String perm : permList) {
			System.out.println(perm);
		}
	
	}
	
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		permutationsHelper(permList, nameList, 0, nameList.size() - 1);
	}
	
	private static void permutationsHelper(ArrayList<String> permList, ArrayList<String> nameList, int startIndex, int endIndex) {
		//Adds a string of names representing a permutation to the permList
		 if(startIndex == endIndex) {
			 String namesPerm = "";
			 for(String name : nameList) {
				 namesPerm+=name + " ";
			 }
			 
			 //Don't remove duplicate names permutation because they represent unique people.
			 permList.add(namesPerm);
			 
		 } else { 
			 for(int i = startIndex; i <= endIndex; i++) {
				 //Swap each element with each element after it with backtracking
				 swap(nameList, startIndex, i); 
				 permutationsHelper(permList, nameList, startIndex + 1, endIndex);
				 swap(nameList, startIndex, i);
			 }
		 }
	}
	
	private static void swap(ArrayList<String> arr, int start, int i) {
		String temp = arr.get(start);
		arr.set(start, arr.get(i));
		arr.set(i, temp);
	}
	
}
