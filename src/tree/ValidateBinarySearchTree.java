package tree;

public class ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
        return dfs(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    
    public boolean dfs(TreeNode node, int min, int max){
        if(node == null) {
            return true;
        }else{
            if(node.val > max && node.val < min){
                return dfs(node.left, node.val, max)&& dfs(node.right, min, node.val);
            }else{
                return false;
            } 
        }
    }
}
