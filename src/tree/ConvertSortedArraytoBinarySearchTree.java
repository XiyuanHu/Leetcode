package tree;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
        return dfs(num,0,num.length-1);
    }
    
    public TreeNode dfs(int[] num, int start, int end){
        if(start > end) return null;
        if(start == end) return new TreeNode(num[start]);
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = dfs(num, start,mid-1);
        node.right = dfs(num,mid+1,end);
        return node;
    }

}
