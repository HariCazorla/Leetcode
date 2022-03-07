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
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        int carry = 0;
        ListNode res = null, prev = null;
        while(true) {
            int sum = 0;
            if (l1 == null && l2 == null) {
                sum = carry;
            }
            else if (l1 == null) {
                sum = l2.val + carry;
            }
            else if (l2 == null) {
                sum = l1.val + carry;
            }
            else {
                sum = l1.val + l2.val + carry;                
            }
            
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }
            else {
                carry = 0;
            }
            
            ListNode node = new ListNode(sum, null);
            
            if (res == null) {
                res = node;
                prev = node;
            }
            else {
                prev.next = node;
                prev = node;
            }
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            
            if (l1 == null && l2 == null && carry == 0) {
                break;
            }
        }
        return res;
    }
}