# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        def insertAtBeginning(new_head, node):
            node.next = new_head
            return node
        
        new_head = None
        curr = head
        
        while curr:
            nxt = curr.next
            new_head = insertAtBeginning(new_head, curr)
            curr = nxt
        
        return new_head