package tree;

public class SortedListToBST {
	
	public static TreeNode sortedListToBST(ListNode head) {
        if(head == null || head.next == null) return new TreeNode(head.val);
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null && p2.next != null){
            p2 = p2.next.next;
            p1 = p1.next;
        }
        TreeNode root = new TreeNode(p1.val);
        p2 = p1.next;
        p1 = null;
        p1 = head;
        
        root.left = sortedListToBST(p1);
        root.right = sortedListToBST(p2);
        return root;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		TreeNode node = sortedListToBST(n1);

	}

}
