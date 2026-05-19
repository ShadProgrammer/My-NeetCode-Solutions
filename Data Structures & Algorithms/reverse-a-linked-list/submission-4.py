# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head):
        
        def insertAtBeginning(new_head, head):
            head.next = new_head
            return head
        
        new_head = None
        temp = head
        
        while temp:
            nxt = temp.next
            new_head = insertAtBeginning(new_head, temp)
            temp = nxt
        
        return new_head