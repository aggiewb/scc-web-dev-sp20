import java.util.Queue;
import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(Queue<Integer> nums){
	    Stack<Integer> temp = new Stack<>();
	    
	    //Add items from queue to stack, but also add items back into the queue
	    for(int i = 0; i < nums.size(); i++){
	        int num = nums.remove();
	        temp.push(num);
	        nums.add(num);
	    }
	    
	    //Remove items from the stack and queue and compare their values, 
	    //and setting palidrome to false if there is a mismatch
	    //Stack and queue values in the "same" order but accessed in reverse order
	    //Add values back into the queue while taking stack values out
	    boolean palindrome = true;
	    while(!temp.isEmpty()){
	        int check = temp.pop();
	        int num = nums.remove();
	        if(check != num){
	            palindrome = false;
	        }
	        nums.add(num);
	    }
	    return palindrome;
	}
}
