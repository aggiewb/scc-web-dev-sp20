
public class LinkedIntList {
	private ListNode front;
	
	public LinkedIntList() {
		front = null;
	}
	
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
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
