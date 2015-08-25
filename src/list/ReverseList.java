package list;

public class ReverseList {

	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode prev, curr, post;
		prev = null;
		curr = head;
		while(curr != null){
			post = curr.next;
			curr.next = prev;
			prev = curr;
			curr = post;
		}
		return prev;
	}
	public static void main(String[] args) {
		ListNode p1 = new ListNode(1);
		ListNode p2 = new ListNode(2);
		ListNode p3 = new ListNode(3);
		ListNode p4 = new ListNode(4);
		ListNode p5 = new ListNode(5);
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		p4.next = p5;
		
		ListNode res = reverseList(p1);
		System.out.println(res.next.val);

	}

}
