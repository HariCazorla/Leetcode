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
        boolean carry = false;
        ListNode node = new ListNode();
        ListNode head = node;
        while(true) {
            int sum = 0;
            if (l1 == null && l2 == null && !carry) {
                break;
            }
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum = carry ? sum+1 : sum;
            if (sum > 9) {
                carry = true;
            } else {
                carry = false;
            }
            
            node.next = new ListNode(sum%10);
            node = node.next;
        }
        return head.next;
    }
}