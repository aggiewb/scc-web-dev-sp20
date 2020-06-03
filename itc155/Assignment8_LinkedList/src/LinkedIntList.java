
public class LinkedIntList {
	private ListNode front;
	
	public LinkedIntList() {
		front = null;
	}
	
	public boolean isSorted(){
	    while(front != null && front.next != null){
	        if(front.data > front.next.data){
	            return false;
	        }
	        front = front.next;
	    }
	    return true;
	}
}
