/**
 * Swap Nodes in Pairs
 * 
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * Example
Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
       if (head == null || head.next == null) return head;
       ListNode fake = new ListNode(0);
       fake.next = head;
       head = fake;
       while (head.next != null && head.next.next != null) {
           ListNode n1 = head.next, n2 = head.next.next;
           n1.next = n2.next;
           n2.next = n1;
           head.next = n2;
           head = n1;
       }
       return fake.next;
    }
}