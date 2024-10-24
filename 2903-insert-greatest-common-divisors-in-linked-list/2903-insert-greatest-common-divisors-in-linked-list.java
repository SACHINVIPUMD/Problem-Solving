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
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int a = curr.val;
            int b = curr.next.val;
            ListNode newnode = new ListNode(gcd(a,b));
            newnode.next = curr.next;
            curr.next = newnode;
            curr = curr.next.next;
        }
        return head;
    }
}