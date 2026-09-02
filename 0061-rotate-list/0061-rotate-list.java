class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int len = length(head);
        k = k % len;
        if(k == 0) {
            return head;
        }
        int rev = len - k;
        ListNode current = head;
        for(int i = 1; i < rev; i++) {
            current = current.next;
        }
        ListNode newHead = current.next;

        // Break the list
        current.next = null;

        // Go to the end of the second part
        ListNode temp = newHead;

        while(temp.next != null) {
            temp = temp.next;
        }

        // Attach first part to the end
        temp.next = head;

        return newHead;
    }

    public int length(ListNode head) {
        int cnt = 0;

        while(head != null) {
            cnt++;
            head = head.next;
        }

        return cnt;
    }
}



