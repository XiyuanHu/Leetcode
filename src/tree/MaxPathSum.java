package tree;
import java.util.Vector;

public class MaxPathSum {

    public int maxPathSum(TreeNode root) {
        int max = 0;
        Vector<Integer> sum = new Vector<Integer>();
        sum.clear();
        sum.add(Integer.MIN_VALUE);
        recur(root, max, sum);
        
        return sum.get(sum.size()-1);
    }
    
    public int recur(TreeNode root, int max, Vector<Integer> sum){
        if(root == null) return 0;
        
        int l = recur(root.left,max,sum);
        int r = recur(root.right,max,sum);
        max = root.val;
        if(l > 0){
            max += l;
        }
        if(r > 0){
            max += r;
        }
        if(max > sum.get(sum.size()-1)){
            sum.add(max);
        }
        return max(l,r) > 0?max(l,r)+root.val:root.val;
        
    }
    
    public int max(int a, int b){
        if(a > b) return a;
        else return b;
    }
    public class TreeNode{
    	int val; 
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x){
    		val = x;
    	}
    }
}
