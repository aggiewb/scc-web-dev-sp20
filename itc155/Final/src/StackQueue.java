import java.util.Stack;

public class StackQueue {
	public static boolean equals(Stack<Integer> firstNums, Stack<Integer>secondNums){
	    Stack<Integer> auxStorage = new Stack<>();
	    boolean isEqual = true;
	    
	    if(firstNums.size() != secondNums.size()){
	        isEqual = false;
	        return isEqual;
	    } else {
	        while(!firstNums.isEmpty()){
	            int firstNum = firstNums.pop();
	            int secondNum = secondNums.pop();
	            if(firstNum != secondNum){
	                isEqual = false;
	            }
	            auxStorage.push(firstNum);
	            auxStorage.push(secondNum);
	        }
	    }
	    
	    while(!auxStorage.isEmpty()){
	        secondNums.push(auxStorage.pop());
	        firstNums.push(auxStorage.pop());
	    }
	    
	    return isEqual;
	}
}
