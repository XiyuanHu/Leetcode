package tree;

public class SemmetricTree {

	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left != null && root.right == null) return false;
        if(root.left == null && root.right != null) return false;
        
        return helper(root.left,root.right);    
    }
    
    public boolean helper(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l == null && r != null) return false;
        if(l != null && r == null) return false;
        
        if(l.val == r.val){
            return helper(l.left,r.right)&&helper(l.right,r.left);
        }else{
            return false;
        } 
    }
}
