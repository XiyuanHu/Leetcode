# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        #精简版本
        if p and q:
            return (p.val == q.val) and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        else:
            return q == p 
            
        #糊糊版本
        # if not p and not q:
        #     return True 
        # if (p and not q) or (q and not p):
        #     return False 
        # if p.val == q.val and self.isSameTree(q.left, p.left) and self.isSameTree(q.right, p.right):
        #     return True
        # else:
        #     return False 
        