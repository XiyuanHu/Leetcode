# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        if head == None : return head 
        dummy_head = ListNode(-1)
        returned_head = dummy_head
        dummy_head.next = head
        # 这种办法可以包括所有的元素，不会拉下最后一个
        while dummy_head.next != None:
            if dummy_head.next.val != val:
                dummy_head = dummy_head.next
            else:
                dummy_head.next = dummy_head.next.next
        #这种方法会拉下最后一个node，需要在最后check最后一个node 
        # while head != None and head.next != None:
        #     if head.val != val:
        #         dummy_head.next = head 
        #         dummy_head = dummy_head.next 
        #     head = head.next
        
        # if head.val == val:
        #     dummy_head.next = None
        # else:
        #     dummy_head.next = head
        
        return returned_head.next
                