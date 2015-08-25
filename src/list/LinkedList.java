package list;

public class LinkedList {
	
	//print the list
	public void printList(ListNode head){
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	//1. count the number of times a given int occurs in a list
	public int count(ListNode head, int target){
		int count = 0;
		while(head.next != null){
			if(head.val == target){
				count++;
			}
			head = head.next;
		}
		return count;
	}
	
	//2. get nth data in the list
	public int getNth(ListNode head, int index){
		if(index < 0) return -1;
		int count = 0;
		while(head.next != null){
			if(count == index){
				return head.val;
			}else{
				count ++;
				head = head.next;
			}
		}
		return -1;
	}
	
	//3. delete list
	public void deleteList(ListNode head){
		if(head == null) return;
		ListNode next;
		while(head != null){
			next = head.next;
			head = null; //ÊÍ·Å¿Õ¼ä
			head = next;
		}
		head = null;
	}
	
	//4. pop: delete the head node and return the head node's data
	public int pop(ListNode head){
		if(head == null) return -1;
		ListNode node = head;
		head = head.next;
		return node.val;
	}
	
	//5. insert a new node with any index within a list
	public void insertNth(ListNode head, int data, int index){
		if(head == null) return;
		if(index < 0) return; 
		int count = 0;
		ListNode prev = head;
		while(head != null){
			if(count == index){
				prev = new ListNode(data);
				prev.next = head;
				printList(head);
				return;
			}else{
				count++;
				prev = head;
				head = head.next;
			}
		}	
	}
	
	public static void main(String[] args) {
		
		ListNode node = new ListNode(1);
		node.next  = new ListNode(2);
		node.next.next  = new ListNode(3);
		node.next.next.next  = new ListNode(4);
		node.next.next.next.next  = new ListNode(5);
		
		
		

	}

}
