package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BinaryTree {
	
	//二叉树的遍历
	//recursive version
	public void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.val);
			inOrder(root.right);
		}
	}
	//中序遍历 非递归方式 Iteration version
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        
        Vector<TreeNode> sta = new Vector<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        TreeNode node = root;
        while(node != null || sta.size() > 0){
            while(node != null){
                sta.add(node);
                node = node.left;
            }
            node = sta.lastElement();
            sta.remove(sta.size()-1);
            result.add(node.val);
            node = node.right;
        }
        return result;
    }
	
	public void preOrder(TreeNode root){
		if(root != null){
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(TreeNode root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.val);
		}
	}
	
	public void arrInorder(int[] arr, int start, int end){ 
		//数组表示时，下标 i*2+1 为左孩子， i*2+2 为右孩子
		if(start > end) return;
		arrInorder(arr, start*2+1, end);
		System.out.print(arr[start]);
		arrInorder(arr, start*2+2, end);
	}
	
	//二叉树常见问题
	//1.节点数
	public int getNums(TreeNode root){
		if(root != null){
			return getNums(root.left) + getNums(root.right) + 1;
		}
		return 0;
	}
	
	//2.二叉树深度
	public int getDepth(TreeNode root){
		if(root != null){
			int left = getDepth(root.left);
			int right = getDepth(root.right);
			return left > right? left+1:right+1;
		}
		return 0;
	}
	
	//3. 分层遍历二叉树
	public void levelOrder(TreeNode root){
		
			/*queue.add(root);
			 * while(queue.size() > 0){
			 * 	 	TreeNode tmp = queue.front();
			 * 		queue.pop();
			 * 		print(tmp);
			 * 		if(tmp.left){
			 * 			queue.push(tmp.left);
			 * 		}
			 * 		if(tmp.right){
			 * 			queue.push(tmp.right);
			 * 		}
			 * }
			 * */
		if(root == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);
		while(queue.size()>0){
			TreeNode node = queue.poll();
			System.out.println(node.val);
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
		}
	}
	
	//4. 将二叉树变为有序的双向链表
	public void treeToList(TreeNode root){
		
	}
	
	//5. 找到二叉树中指定一点的所有祖先
	public boolean findAncester(TreeNode root, int target){
		if(root == null) return false;
		if(root.val == target) return true;
		
		if(findAncester(root.left, target) || findAncester(root.right, target)){
			System.out.println(root.val);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		int[] arr = {
				4,2,5,1,3
		};
		tree.arrInorder(arr, 0, arr.length-1);
		tree.levelOrder(node);
		//tree.inOrder(node);

	}
	
	public boolean isValid(String s) {
        if(s == null) return true;
        Vector<Character> stack = new Vector<Character>();
        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            if(sc == '(' || sc == '{' || sc == '['){
                stack.add(sc);
            }else{
                char c = stack.lastElement();
                if(c == sc){
                    stack.remove(stack.size()-1);
                }else{
                    return false;
                }
            }
        }
        return true;
    }


}
