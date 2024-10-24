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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy = dummy1;
        while(curr!=null){
            int sum = 0;
            while(curr.val!=0){
                sum+=curr.val;
                curr = curr.next;
            }
            curr = curr.next;
            ListNode newnode = new ListNode(sum);
            dummy.next = newnode;
            dummy = newnode;
        }
        return dummy1.next;
    }
}