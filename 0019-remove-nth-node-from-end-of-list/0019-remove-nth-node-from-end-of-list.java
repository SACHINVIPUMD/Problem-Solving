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
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(n>0){
            if(fast==null){
                return new ListNode();
            }
            n--;
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null){
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}