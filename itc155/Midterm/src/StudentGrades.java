import java.util.Scanner;
import java.util.HashMap;

/* Given a HashMap pre-filled with student names as keys and grades as values,
complete main() by reading in the name of a student, outputting their original grade,
and then reading in and outputting their new grade. */

public class StudentGrades {
	public static void main (String[] args) {
		
		HashMap<String, Double> studentGrades = new HashMap<String, Double>();

		// Students's grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);

		changeGrades(studentGrades);
	
		System.out.println("Entire class with grades: " + studentGrades.toString());
		
	}
	
	private static void changeGrades(HashMap<String, Double> studentGrades) {
		Scanner input = new Scanner(System.in);
		String studentName = "";
		String exit = "exit now";
		System.out.print("Type student's name. Type " + exit + " to finish: ");
		studentName = input.next() + " " + input.next();
		
		while(!studentName.equals(exit)) {
			
			if(studentGrades.containsKey(studentName)) {
				System.out.println(studentName + "\'s original grade: " + studentGrades.get(studentName));
			} else {
				System.out.println(studentName + " is not currently in this class, but has been added.");
			}
			
			System.out.print("Type " + studentName + "\'s new grade: ");
			double studentGrade = input.nextDouble();
			
			if(studentGrades.containsKey(studentName)) {
				studentGrades.replace(studentName, studentGrade);
				System.out.println(studentName + "\'s new grade: " + studentGrades.get(studentName));
			} else {
				studentGrades.put(studentName, studentGrade);
				System.out.println("Added new student: " + studentName + " with a grade of: " + studentGrades.get(studentName));
			}
			
			System.out.print("Type another student's name. Type " + exit + " to finish: ");
			studentName = input.next() + " " + input.next();	
		}
		
		input.close();
		
	}
	
}
