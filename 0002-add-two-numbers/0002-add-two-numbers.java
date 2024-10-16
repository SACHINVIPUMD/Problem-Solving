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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        // ListNode dummy = new ListNode(0);
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        int num = 0;
        while(temp1 != null || temp2!=null){
            if(temp1!=null && temp2!=null)
            num = temp1.val+temp2.val+carry;
            else if(temp1==null && temp2!=null){
                num = temp2.val + carry;
            }
            else{
                num = temp1.val+carry;
            }
            carry = 0;
            if(num/10 > 0){
                num = num%10;
                carry = 1;
            }
            dummy.next = new ListNode(num);
            dummy = dummy.next;
            if(temp1!=null){
                temp1 = temp1.next;
            }
            if(temp2!=null){
                temp2 = temp2.next;
            }
        }
        if(carry ==1){
            dummy.next = new ListNode(carry);
        }
        return head.next;
    }
}