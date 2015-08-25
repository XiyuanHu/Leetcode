package tree;

public class MinBinaryTreeDepth {

	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root,1);
    }
    
    public int depth(TreeNode node, int depth){
        if(node == null) return Integer.MAX_VALUE;
        if(node.left == null && node.right == null) return depth;
        int l = depth(node.left, depth+1);
        int r = depth(node.right, depth+1);
        return Math.min(l,r);
    }
    
}
