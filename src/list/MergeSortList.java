package list;

import java.util.HashMap;

public class MergeSortList {

	public ListNode sort(ListNode head) {
        if(head == null || head.next == null) return head;
        
        //ListNode a = null, b = null;
        //split(head, a, b);
        ListNode runner1 = head;
        ListNode runner2 = head.next;
        while(runner2 != null && runner2.next != null){
            runner1 = runner1.next;
            runner2 = runner2.next.next;
        }
        runner2 = runner1.next;
        runner1.next = null;
        runner1 = head;
        
        //ListNode tA = sort(a);
        //ListNode tB = sort(b);
        //ListNode ret = merge(tA, tB);
        return merge(sort(runner1),sort(runner2));
    }
    
    /*public void split(ListNode head, ListNode a, ListNode b){
        if(head == null) return;
        ListNode runner1 = head;
        ListNode runner2 = head.next;
        while(runner2 != null && runner2.next != null){
            runner1 = runner1.next;
            runner2 = runner2.next.next;
        }
        b = runner1.next;
        runner1.next = null;
        a = head;
        
    }*/
    
    public ListNode merge(ListNode a, ListNode b){
        if(a == null) return b;
        if(b == null) return a;
        ListNode head = (a.val < b.val)?a:b;
        if(head == a){
            a = a.next;
        }else if(head == b){
            b = b.next;
        }
        ListNode copyHead = head;
        while(a != null && b != null){
            if(a.val < b.val){
                head.next = a;
                a = a.next;
            }else{
                head.next = b;
                b = b.next;
            }
            head = head.next;
        }
        if(a != null){
          head.next = a;  
        }
        if(b != null){
            head.next = b;
        }
        return copyHead;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode head2 = new ListNode(2);
		head.next = head2;
		ListNode a = null;
		ListNode b = null;
		//split(head, a, b);
		System.out.println(a.val);
		System.out.println(b.val);
		

		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		
		
	}

}
