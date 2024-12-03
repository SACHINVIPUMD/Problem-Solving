class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temphead = head;
        int count = 0;
        
        // Count the number of nodes in the list
        while (temphead != null && count < k) {
            temphead = temphead.next;
            count++;
        }
        
        // If there are less than k nodes remaining, return head (no reversal)
        if (count < k) {
            return head;
        }
        
        // Reverse the first k nodes
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        // Recursively reverse the rest of the list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        // 'prev' now points to the head of the reversed group
        return prev;
    }
}
