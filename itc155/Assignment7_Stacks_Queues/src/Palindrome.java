import java.util.Queue;
import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(Queue<Integer> nums){
	    Stack<Integer> temp = new Stack<>();
	    
	    for(int i = 0; i < nums.size(); i++){
	        int num = nums.remove();
	        temp.push(num);
	        nums.add(num);
	    }
	    
	    
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
