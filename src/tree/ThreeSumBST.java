package tree;

import java.util.Vector;

public class ThreeSumBST {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	} 
	
	public boolean has3Sum(TreeNode root){
		if(root == null) return false;
		Vector<Integer> vector = new Vector<Integer>();
		toArray(root, vector);
		
		for(int i = 0; i < vector.size(); i++){
			int j = i + 1;
			int k = vector.size() - 1;
			while(j < k){
				if(vector.get(i) + vector.get(j) + vector.get(k) < 0){
					j++;
				}else if(vector.get(i) + vector.get(j) + vector.get(k) > 0){
					k--;
				}else{
					return true;
				}
			}
		}
		return false;
	}
	
	public void toArray(TreeNode root, Vector<Integer> vector){
		if(root != null){
			toArray(root.left, vector);
			vector.add(root.val);
			toArray(root.right, vector);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
