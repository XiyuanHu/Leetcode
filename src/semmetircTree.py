# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        #第四版本
        def helper(left, right):
            if left and right:
                return left.val == right.val and helper(left.left, right.right) and helper(left.right, right.left)
            else:
                return left == right
        return helper(root, root)
    #第三版本
    #     if root is None: return True 
    #     return self.helper(root.left, root.right)
            
    # def helper(self, left, right):
        # if left and right:
        #     return left.val == right.val and self.helper(left.left, right.right) and self.helper(left.right, right.left)
        # else:
        #     return left == right 
            
        #第二版本
        # if not left and not right : return True 
        # if not left or not right: return False 
        # if left.val != right.val: return False 
        # return self.helper(left.left, right.right) and self.helper(left.right, right.left)
       
        #第一版本
        # if left and right:
        #     if left.val == right.val:
        #         return self.helper(left.left, right.right) and self.helper(left.right, right.left)
        #     else:
        #         return False 
        # elif left is None and right is None:
        #     return True 
        # else:
        #     return False 
        
        