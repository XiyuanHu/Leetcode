package list;

public class SwapNodeInPairs {
	
	public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode p1,p2,next,prev = null;
        p1 = head;
        p2 = head.next;
        head = p2;
        
        while(p1 != null && p2 != null){
            if(prev != null) prev.next = p2;
            next = p2.next;
            p2.next = p1;
            p1.next = next;
            prev = p1;
            
           if(next == null) break;
           else{
               p1 = next;
               p2 = p1.next;
           }
            
        }
        return head;
    }
}
