package tree;

public class SumRoottoLeafNumbers {
	public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    
    public int dfs(TreeNode node, int base){
        if(node == null) return 0;
        base = base*10 + node.val;
        if(node.left == null && node.right == null) return base;
        return dfs(node.left,base) + dfs(node.right,base);
    } 

}
