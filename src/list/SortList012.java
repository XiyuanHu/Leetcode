package list;

public class SortList012 {

	public ListNode sortList(ListNode head){
		if(head == null) return head;
		ListNode copyHead = head;
		int count0 = 0, count1 = 0, count2 = 0;
		while(head != null){
			if(head.val == 0){
				count0++;
			}else if(head.val == 1){
				count1++;
			}else{
				count2++;
			}
			while(count0 > 0){
				head.val = 0;
				head = head.next;
				count0--;
			}
			while(count1 > 0){
				head.val = 1;
				head = head.next;
				count1--;
			}
			while(count2 > 0){
				head.val = 2;
				head = head.next;
				count2--;
			}
		}
		return copyHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
