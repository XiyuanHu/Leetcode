# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        # 开了一个额外的array 来实现
        array = []
        dummy_head = head 
        while dummy_head != None:
            array.append(dummy_head.val)
            dummy_head = dummy_head.next 
        
        length = len(array) -1
        for i in xrange(length+1):
            if array[i] != array[length]:
                return False
            length -= 1 
            
        return True 

        #尝试用O(N) 时间 ＋ O(1) 空间实现
        #找到mid node， 把后半段list reverse，再和前半段比较 
        if head == None or head.next == None : 
            return True 
            
        slow, fast = head, head 
        while fast.next != None and fast.next.next != None:
            fast = fast.next.next
            slow = slow.next 
    
        next_head = slow.next 
        slow.next = None 
        
        pre = None 
        while next_head != None: 
            next = next_head.next 
            next_head.next = pre
            pre = next_head
            next_head = next 
        
        left = head 
        right = pre 
        
        while left != None and right != None:
            if left.val != right.val:
                return False
            left = left.next 
            right = right.next 
        
        return True 