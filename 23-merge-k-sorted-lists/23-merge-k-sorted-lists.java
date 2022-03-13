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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < lists.length; i++) {
            ListNode smallList = lists[i];
            while (smallList != null) {
                nums.add(smallList.val);
                smallList = smallList.next;
            }
        }
        System.out.println(nums);
        int numsArray[] = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            numsArray[i] = nums.get(i);
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(numsArray[i] + " ");
        }
        System.out.println("");        
        Arrays.sort(numsArray);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(numsArray[i] + " ");
        }
        System.out.println("");
        
        ListNode head = null;
        ListNode prev = null;
        
        for (int i = 0; i < numsArray.length; i++) {
            ListNode node = new ListNode(numsArray[i], null);
            if (head == null) {
                head = node;
                prev = head;
            } else {
                prev.next = node;
                prev = node;
            }
        }
        
        return head;
    }
}