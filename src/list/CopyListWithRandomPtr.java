package list;

import java.util.HashMap;

public class CopyListWithRandomPtr {
	
	private class RandomListNode{
		RandomListNode next;
		RandomListNode random;
	}
	public RandomListNode copyListWithRandomPtr(RandomListNode head) {
        if(head == null) return null;
        RandomListNode newHead = new RandomListNode();
        
        RandomListNode copyNewHead = newHead;
        RandomListNode copyHead = head;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        
        map.put(copyHead, copyNewHead);
        copyHead = copyHead.next;
       
        while(copyHead != null){
            copyNewHead.next = new RandomListNode();
            copyNewHead = copyNewHead.next;
            map.put(copyHead, copyNewHead);
            copyHead = copyHead.next;
            
        }
        
        RandomListNode copyNewHead2 = newHead;
        copyHead = head;
        while(copyHead != null){
            if(copyHead.random != null){
                copyNewHead2.random = map.get(copyHead.random);
            }else{
                copyNewHead2.random = null;
            }
            copyNewHead2 = copyNewHead2.next;
            copyHead = copyHead.next;
        }
        return newHead;
    }
	
	/*
	 * public ListNode copyListWithRandomPtr(ListNode head) {
        if(head == null) return head;
        ListNode copyHead = head;
        while(copyHead != null){
            ListNode node = new ListNode();
            node.next = copyHead.next;
            copyHead.next = node;
            copyHead = copyHead.next.next;
        }
        copyHead = head;
        while(copyHead != null){
            if(copyHead.random != null){
                copyHead.next.random = copyHead.random.next;
            }
            copyHead = copyHead.next.next;
        }
        
        copyHead = head; 
        ListNode newHead = copyHead.next;
        ListNode copyNewHead = newHead;
        while(copyHead != null && newHead.next != null){
            copyHead.next = newHead.next;
            newHead.next = newHead.next.next;
            copyHead = copyHead.next;
            newHead = newHead.next;
        }
        return copyNewHead;
    }
	 * */

}
