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
        ListNode dummyHead = new ListNode(0, head);
        
        ListNode fast = dummyHead.next;
        ListNode slow = dummyHead.next;
        
        for (int i = 0; i < n; i++) {
            if (fast != null)
                fast = fast.next;
        }
        if(fast == null){
            return slow.next;
        }
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummyHead.next;
    }
}