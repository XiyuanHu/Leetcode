package list;

public class RemoveDuplicatesFromSortedList {
	
	//remove duplicates from sorted list 1
		public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null) return head;
	        
	        ListNode newHead, next;
	        newHead = head;
	        next = newHead.next;
	        while(newHead != null){
	            if(next == null){
	                newHead.next = next;
	                break;
	            }else{
	                if(next.val == newHead.val){
	                    next = next.next;
	                }else{
	                    newHead.next = next;
	                    next = next.next;
	                    newHead = newHead.next;
	                }
	            }
	        }
	        return head;
	}
		
		//remove duplicates from sorted list 2
		public ListNode deleteDuplicates2(ListNode head) {
	        if(head == null || head.next == null) return head;
	        
	        ListNode pre,cur,next,newHead;
	        pre = new ListNode(-1);
	        cur = head;
	        next = head.next;
	        newHead = pre;
	        
	        int dummy = Integer.MIN_VALUE;
	        
	        while(cur != null){
	            if(next == null){
	                if(cur.val != dummy){
	                    cur.next = next;
	                    break;
	                }else{
	                    pre.next = next;
	                    break;
	                }
	            }else{
	                if(cur.val == next.val){
	                    next = next.next;
	                    cur.next = next;
	                    dummy = cur.val;
	                }else{
	                    if(cur.val == dummy){
	                        pre.next = next;
	                        cur = next;
	                        next = next.next;
	                    }else{
	                        pre.next = cur;
	                        pre = pre.next;
	                        cur = next;
	                        next = next.next;
	                    }
	                }
	            }
	        }
	        return newHead.next;
	    }
		
		/*public ListNode deleteDuplicates(ListNode head) {
			ListNode re,tail,pre=head,cur=head;       
			re = new ListNode(0);
			tail=re;        
			while(cur!=null&&cur.next!=null){
				while(cur.next!=null&&cur.val==cur.next.val) cur=cur.next;
				if(pre==cur){  //distinct value    ????Ϊʲô              
					tail.next=pre;
					tail=tail.next;
				}                                         
				pre=cur.next;
				cur=cur.next;          
			}
			tail.next=cur; //add the last value
			return re.next; //dump the dummy node
		}*/
}
