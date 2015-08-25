package list;

public class AddTwoNumbers{

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;
        
        int sign = 0;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        
        while(l1 != null && l2 != null){
            int val = (l1.val + l2.val + sign) % 10;
            sign = (l1.val + l2.val + sign) /10;
            l1 = l1.next;
            l2 = l2.next;
            node.next = new ListNode(val);
            node = node.next;
        }
        
        while(l1 == null && l2 != null){
            int val = (l2.val + sign) % 10;
            sign = (l2.val + sign) /10;
            l2 = l2.next;
            node.next = new ListNode(val);
            node = node.next;
        }
        
        while(l1 != null && l2 == null){
            int val = (l1.val + sign) % 10;
            sign = (l1.val + sign) /10;
            l1 = l1.next;
            node.next = new ListNode(val);
            node = node.next;
        }
        
        if(sign != 0){
            node.next = new ListNode(sign);
            node = node.next;
        }
        return head.next;
    }
}
