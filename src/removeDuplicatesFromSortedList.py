# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next: 
            return head 
        slow = head 
        fast = head.next 
       #while fast != None:
        while fast is not None:
       #这两种方式都可以 但是while not fast 不可以 
            if slow.val != fast.val:
                slow.next = fast 
                slow = fast  
            fast = fast.next 
        slow.next = fast 
        return head 

        #高端版本！！！
        node = head 
        while node:
            while node.next and node.next.val == node.val:
                node.next = node.next.next
            node = node.next

        return head