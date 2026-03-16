/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Step 1: Check if at least k nodes remain
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count == k) {
            // Step 2: Reverse k nodes
            ListNode reversedHead = reverseKGroup(curr, k); // recursion for next group
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = reversedHead;
                reversedHead = head;
                head = temp;
            }
            head = reversedHead;
        }

        return head;
    }
}

