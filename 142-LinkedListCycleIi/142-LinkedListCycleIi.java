// Last updated: 7/9/2026, 3:09:26 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean iscycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                iscycle = true;
                break;
            }
        }
        if(!iscycle)
            return null;
        while(head!=slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}