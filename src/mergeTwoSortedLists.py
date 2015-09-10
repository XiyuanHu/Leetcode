# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # if not l1:
        #     return l2 
        # if not l2: 
        #     return l1 
        #这段不需要！！
            
        dummy_head = ListNode(-1)
        head = dummy_head 
        while l1 and l2:
            if l1.val < l2.val:
                head.next = l1 
                l1 = l1.next 
            else :
                head.next = l2
                l2 = l2.next 
            head = head.next 
        
        # if l1:
        #     head.next = l1 
        # if l2:
        #      head.next = l2 
        #高端版本！
        head.next = l1 or l2
        
        return dummy_head.next 
            
        
        