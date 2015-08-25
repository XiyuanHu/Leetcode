package list;

public class ReverseList2 {
	
	public  static ListNode reverseList(ListNode head){
		if(head == null) return head;
		
		ListNode curr = head;
		ListNode next = head.next;
		while(curr != null && next != null){
			ListNode tmp = next.next;
			next.next = curr;
			curr = next;
			next = tmp;
		}
		head.next = null;
		return curr;
	}
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		System.out.println(reverseList(l1).next.next.next.next.val);
		
	}
}
