# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        #注意使用dummy node, 否则当array长度为1 的时候会出错
        dummy_node = ListNode(-1)
        dummy_node.next = head 
        slow, fast = dummy_node, dummy_node 
        
        for _ in xrange(n):
            fast = fast.next
        
        while fast != None and fast.next != None :
            slow = slow.next 
            fast = fast.next 
        
        slow.next = slow.next.next
            
        return dummy_node.next  
        