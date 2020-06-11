
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
	
	public boolean hasTwoConsecutive(){
	    ListNode current = front;
	    while(current != null && current.next != null){
	        if(current.data + 1 == current.next.data){
	            return true;
	        }
	        current = current.next;
	    }
	    return false;
	}
}
