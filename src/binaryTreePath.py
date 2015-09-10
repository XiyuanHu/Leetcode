class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        #解法一：重点list combination 
        # if root is None:
        #     return []
        # if root.left is None and root.right is None:
        #     return [str(root.val)]
        # res = self.binaryTreePaths(root.left) + self.binaryTreePaths(root.right)
        # return [str(root.val) + '->' + i for i in res]

        #解法二：generator 
        def gen_path(root):
            if root:
                if not root.left and not root.right:
                    yield [str(root.val)]
                for path in gen_path(root.left):
                    yield [str(root.val)] + path
                for path in gen_path(root.right):
                    yield [str(root.val)] + path
       # return ['->'.join(map(str,path)) for path in gen_path(root)]
        res = []
        for path in gen_path(root):
            res.append('->'.join(path))
            #res.append('->'.join(map(str,path)))
        return res 

# class Solution(object):
#     def binaryTreePaths(self, root):
#         """
#         :type root: TreeNode
#         :rtype: List[str]
#         """
#         self.ans = []
#         if root is None:
#             return self.ans
#         def dfs(root, path):
#             if root.left is None and root.right is None:
#                 print path
#                 self.ans.append(path) 
#                 print self.ans
#                 return self.ans
#             if root.left:
#                 dfs(root.left, path + '->' + str(root.left.val))
#             if root.right:
#                 dfs(root.right, path + '->' + str(root.right.val))
        
#         dfs(root, str(root.val))
#         return self.ans



# class Solution(object):
#     def binaryTreePaths(self, root):
#         """
#         :type root: TreeNode
#         :rtype: List[str]
#         """
#         self.ans = []
#         if root is None:
#             return self.ans
#         else:
#             gen = self.dfs(root, str(root.val))
#             print(gen.next())
#             return [item for item in self.dfs(root, str(root.val))]
            
#     def dfs(self, root, path):
#         if root.left is None and root.right is None:
#             self.ans.append(path)
#         if root.left:
#             self.dfs(root.left, path + '->' + str(root.left.val))
#         if root.right:
#             self.dfs(root.right, path + '->' + str(root.right.val))

# if __name__ == '__main__':
#     s = Solution()
#     root = TreeNode(1)
#     root.left = TreeNode(2)
#    # root.right = TreeNode()
#     print s.binaryTreePaths(root)