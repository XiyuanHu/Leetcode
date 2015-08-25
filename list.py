# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param two ListNodes
    # @return the intersected ListNode
    

if __name__ == '__main__':
    headA = ListNode(1)
    n1 = ListNode(3)
    n2 = ListNode(5)
    headA.next = n1
    n1.next = n2
    

    headB = ListNode(2)
    n3 = ListNode(4)
    headB.next = n3


    n4 = ListNode(6)
    n5 = ListNode(7)
    n6 = ListNode(8)
    n7 = ListNode(9)
    n8 = ListNode(10)

    n2.next = n4
    n3.next = n4

    n4.next = n5
    n5.next = n6
    n6.next = n7 
    n7.next = n8 
    n8.next = None

    
    test = Solution()
    result = test.getIntersectionNode(headA, headB)
    print(result.val)
