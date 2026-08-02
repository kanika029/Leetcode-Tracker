// Last updated: 8/2/2026, 9:29:52 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if (head == null) return;
14        ListNode slow = head, fast = head;
15        while (fast != null && fast.next != null) {
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        ListNode second = slow.next;
20        slow.next = null;
21        ListNode node = null;
22
23        while (second != null) {
24            ListNode temp = second.next;
25            second.next = node;
26            node = second;
27            second = temp;
28        }
29        ListNode first = head;
30        second = node;
31
32        while (second != null) {
33            ListNode temp1 = first.next, temp2 = second.next;
34            first.next = second;
35            second.next = temp1;
36            first = temp1;
37            second = temp2;
38        }        
39    }
40}