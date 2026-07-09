// Last updated: 7/9/2026, 3:08:23 PM
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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            curr=curr.next;
            fast=fast.next.next;
        }
        ListNode pre =null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        while(pre!=null && head!=null){
            if(pre.val!=head.val){
                return false;
            }
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}