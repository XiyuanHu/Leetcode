package tree;

import java.util.ArrayList;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
	       if(root == null) return false;
	       if(root.left == null && root.right == null){
	           if(root.val == sum) return true;
	           else return false;
	       }else{
	           return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	       }   
	       
	}
	
	//path sum 2 
	//find all possible results 
	public ArrayList<ArrayList<Integer>> pathSum2(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        int target = 0;
        dfs(result,path,root,target,sum);
        return result;
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path, TreeNode node,int sum, int target){
        if(node == null) return;
        sum += node.val;
        path.add(node.val);
        if(node.left == null && node.right == null && sum == target){
        	//have to make a copy, otherwise, it will be changed
            ArrayList<Integer> copypath = new ArrayList<Integer>(path);
            result.add(copypath);
        }else{
            dfs(result,path,node.left,sum,target);
            dfs(result,path,node.right,sum,target);
        }
        path.remove(path.size()-1);
        sum -= node.val;
    }
}
