
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
		ListNode current = front;
		while(current != null && current.next != null){
	        if(current.data > current.next.data){
	            return false;
	        }
	        current = current.next;
	    }
	    return true;
	}
}
