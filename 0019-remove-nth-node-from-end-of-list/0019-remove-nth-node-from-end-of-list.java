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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        // Move fast pointer n steps ahead
        while(n > 0) {
            if (fast == null) {
                return head;  // If n is larger than the length of the list, return original head
            }
            fast = fast.next;
            n--;
        }
        
        // If fast is null, it means we need to remove the head node
        if (fast == null) {
            return head.next;
        }
        
        // Move both fast and slow pointers until fast reaches the end
        while(fast != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        
        // prev is the node just before the one to remove
        prev.next = prev.next.next;
        
        return head;
    }
}
