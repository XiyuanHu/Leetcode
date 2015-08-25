package tree;

import list.ListNode;

public class ConvertSortedListtoBinarySearchTree {
	// bottom-up
	 class Wrapper{
	        ListNode node;  //java pass reference
	    }
	    
	    public TreeNode sortedListToBST(ListNode head) {
	        if(head == null) return null;
	        ListNode p = head;
	        int len = 0;
	        while(p != null){
	            len++;
	            p = p.next;
	        }
	        Wrapper w = new Wrapper();
	        w.node = head;
	        return generate(w,0,len-1);
	    }
	    
	    public TreeNode generate(Wrapper w, int start, int end){
	        if(start > end) return null;
	        int mid = (start + end)/2;
	        TreeNode leftChild = generate(w, start, mid-1);
	        TreeNode root = new TreeNode(w.node.val);
	        root.left = leftChild;
	        w.node = w.node.next;
	        root.right = generate(w, mid+1, end);
	        return root;
	    }
	    
	
	/*public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(head != null){
            num.add(head.val);
            head = head.next;
        }
        TreeNode root = generate(num, 0, num.size()-1);
        return root;
    }
    
    public TreeNode generate(ArrayList<Integer> num, int start, int end){
        if(start > end) return null;
        if(start == end) return new TreeNode(num.get(start));
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(num.get(mid));
        node.left = generate(num, start, mid-1);
        node.right = generate(num, mid+1, end);
        return node;
    }*/

}
