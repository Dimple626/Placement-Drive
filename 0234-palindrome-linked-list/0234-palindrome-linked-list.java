
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow);
        while(newHead!=null){
            if(head.val!=newHead.val) return false;
            head=head.next;
            newHead=newHead.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=node;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}