package list;
/* Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.*/

public class MergeTwoSortedList {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;
        
        ListNode head,node;
        if(l1.val <= l2.val){
            head = l1;
            l1 = l1.next;
        }else{
            head = l2;
            l2 = l2.next;
        }
        node = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                node.next = l1;
                l1 = l1.next;
            }else{
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        
        if(l1 == null && l2 != null){
            while(l2 != null){
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }
        }
        
        if(l2 == null && l1 != null){
            while(l1 != null){
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            }
        }
        return head;
    }
	
	/* public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode(0);
	        ListNode result = head;
	        while(l1 != null && l2 != null){
	            if(l1.val >= l2.val){
	                ListNode node = new ListNode(l1.val);
	                l1 = l1.next;
	                //System.out.println(head.val);
	                result.next = node;
	            }else if(l1.val < l2.val){
	                ListNode node = new ListNode(l2.val);
	                l2 = l2.next;
	                //System.out.println(head.val);
	                result.next = node;
	            }
	            result = result.next;
	        }
	        if(l1 ==  null){
	        	result.next = l2;
	        } 
	        
	        if(l2 == null){
	        	result.next = l1;
	        }
	        
	        result = head.next;
	        return result;
	    }*/
	 
	/* public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(l1 == null){
	            return l2;
	        }else if(l2 == null){
	            return l1;
	        }else{
	            ListNode head = (l1.val <= l2.val)?l1:l2;
	            ListNode temp = head;
	            if(temp == l1){
	                l1 = l1.next;
	            }
	            
	            if(temp == l2){
	                l2 = l2.next;
	            }
	            
	            while(l1 != null && l2!=null){
	                ListNode tmp = (l1.val <= l2.val)?l1:l2;
	            
	                temp.next = tmp;
	                
	                if(tmp == l1){
	                    l1 = l1.next;
	                }else if(tmp == l2){
	                    l2 = l2.next;
	                }
	               // tmp = tmp.next;
	                temp = temp.next;
	            }
	            
	            if(l1!=null){
	                temp.next = l1;
	            }
	            
	            if(l2 != null){
	                temp.next =l2;
	            }
	            
	            return head; 
	        }
	    }*/

	public static void main(String[] args) {
		 MergeTwoSortedList list = new MergeTwoSortedList();
		 ListNode l1 = new ListNode(1);
		 ListNode l2 = new ListNode(2);
		 ListNode n1 = new ListNode(3);
		 ListNode n2 = new ListNode(4);
		 l1.next = n1;
		 l2.next = n2;
		 ListNode result = list.mergeTwoLists(l1, l2);
		 System.out.println(result.val);
		 System.out.println(result.next.val);
		 System.out.println(result.next.next.val);
		 System.out.println(result.next.next.next.val);
	}

}
