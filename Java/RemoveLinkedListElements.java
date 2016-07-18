/**
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
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
       if (head == null) return null;
       ListNode curr = head;
       ListNode next = curr.next;
       
       while (next != null) {
           if (next.val == val) {
               curr.next = next.next;
               next = curr.next;
           }else {
               curr = next;
               next = curr.next;
           }
       }
       if (head.val == val) {
           head = head.next;
       }
       return head;
    }
}