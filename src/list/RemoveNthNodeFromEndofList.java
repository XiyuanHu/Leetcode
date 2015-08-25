package list;

public class RemoveNthNodeFromEndofList {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head == null) return null;
	        ListNode slow, fast;
	        slow = head;
	        fast = head;
	        int steps = 0;
	        while(steps < n){
	            fast = fast.next;
	            steps++;
	        }
	        if(fast == null) return head.next;
	        while(fast.next != null){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        slow.next = slow.next.next;
	        return head;
	    }
}
