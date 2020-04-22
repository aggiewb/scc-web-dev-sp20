import java.util.ArrayList;

public class Test_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Marty Stepp");
		names.add("Stuart Reges");
		names.add("Alana Turing");
		names.add(2, "Ada Lovelace");
		
		System.out.print(names);
	}

}
