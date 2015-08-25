package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	
	/*
	  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
       if(root == null) return result;
       
       ArrayList<TreeNode> currLevel = new ArrayList<TreeNode>();
       ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();
       
       currLevel.add(root);
       while(currLevel.size() > 0){
           nextLevel.clear();
           ArrayList<Integer> temp = new ArrayList<Integer>();
           for(TreeNode node : currLevel){
               temp.add(node.val);
               if(node.left != null){
                   nextLevel.add(node.left);
               }
               if(node.right != null){
                   nextLevel.add(node.right);
               }
           }
           result.add(temp);
           currLevel.clear();
           for(TreeNode node : nextLevel){
               currLevel.add(node);
           }
       }
        return result;
    }
	 * */

	public  static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> curLevel = new LinkedList<TreeNode>();
        ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
        queue.add(root);
        curLevel.add(root);
        while(queue.size() > 0){
            TreeNode node = queue.poll();
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            nodes.add(node);
            if(node == curLevel.peek() && curLevel.size() > 0){
                curLevel.poll();
                if(curLevel.size() == 0){
                    nodes.add(new TreeNode(Integer.MAX_VALUE));
                    if(queue.size() > 0){
                        for(TreeNode t : queue){
                            curLevel.add(t);
                        }
                    }
                }
            }
        }
        
        ArrayList<Integer> level = new ArrayList<Integer>();
        for(TreeNode node : nodes){
            if(node.val == Integer.MAX_VALUE){
                result.add(level);
                level.clear();
            }else{
                level.add(node.val);
            }
        }
        return result;
    }
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		node1.left = node2;
		levelOrder(node1);
		

	}

}
