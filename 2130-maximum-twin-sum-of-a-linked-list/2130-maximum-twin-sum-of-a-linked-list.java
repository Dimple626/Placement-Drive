class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find middle using slow-fast pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalf = reverse(slow);
        int maxsum = 0;
        ListNode head1 = head;
        while (secondhalf!= null) {
            int sum = head1.val + secondhalf.val;
            if (maxsum < sum) {
                maxsum = sum;
            }
            head1 = head1.next;
            secondhalf = secondhalf.next;
        }
        return maxsum;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}


