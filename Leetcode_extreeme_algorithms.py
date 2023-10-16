
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def addTwoNumbers(self, l1, l2):
    o = 0
    ans = ListNode()
    
    while (l1.val != None) and (l2.val != None):
        if (l1.val + l2.val + o)%10 == 0:
            ans.val = l1.val + l2.val + o
            o = 0
        else:
            ans.val = (l1.val + l2.val + o)%10
            o = 1
        ans.next
        l1.next
        l2.next
    return ans

a = ListNode()
a.val = 1
a.next
a = a.next
print(a.value)