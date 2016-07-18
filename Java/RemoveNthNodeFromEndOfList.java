/**
 * Remove Nth Node From End of List
 * 
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * Notice

The minimum number of nodes in list is n.
 * 
 * Example
Given linked list: 1->2->3->4->5->null, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5->null.
 * 
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0) return head;
        if (head == null || head.next == null) return null;
        ListNode front = head;
        ListNode latter = front;
        int cnt = 0;
        while (latter.next != null) {
            cnt++;
            latter = latter.next;
            if (cnt == n) break;
        }
        
        if (cnt != n) return head.next;
        
        while (latter.next != null) {
            latter = latter.next;
            front = front.next;
        }
        front.next = front.next.next;
        return head;
    }
}
