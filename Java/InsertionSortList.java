/**
 * Insertion Sort List
 * 
 * Sort a linked list using insertion sort.
 * 
 * Example
Given 1->3->2->0->null, return 0->1->2->3->null.
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
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        while (head != null) {
            ListNode tmp = fakeHead;
            while (tmp.next != null) {
                if (tmp.next.val > head.val) break;
                tmp = tmp.next;
            }
            ListNode newHead = head.next;
            head.next = tmp.next;
            tmp.next = head;
            head = newHead;
        }
        return fakeHead.next;
    }
}