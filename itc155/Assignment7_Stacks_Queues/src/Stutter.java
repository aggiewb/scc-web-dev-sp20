import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stutter {
	public static void stutter(Stack<Integer> nums){
	    Queue<Integer> temp = new LinkedList<>();
	    
	    //Remove items from stack and add two of each item to a queue
	    while(!nums.isEmpty()){
	        int toDuplicate = nums.pop();
	        for(int j = 0; j < 2; j++){
	            temp.add(toDuplicate);
	        }
	    }
	    
	    //Remove items from queue and add them back to stack, though they would be in reverse order
	    while(!temp.isEmpty()){
	        nums.push(temp.remove());
	    }
	    
	    //Remove items from stack to queue, which places the items in the queue in the stack original order
	    while(!nums.isEmpty()){
	        int toMove = nums.pop();
	        temp.add(toMove);
	    }
	    
	    //Remove items from queue to stack to put them back in the original order in the stack
	    while(!temp.isEmpty()){
	        nums.push(temp.remove());
	    }
	    
	}
}
