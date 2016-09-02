#include <iostream>

struct ListNode {
    int val;
    ListNode *next = NULL;
};

ListNode* mergeSortedList(ListNode *pHead1, ListNode *pHead2) {
    if (pHead1 == NULL)
        return pHead2;
    if (pHead2 == NULL)
        return pHead1;
    ListNode *pNewHead = NULL;
    if (pHead1->val <= pHead2->val) {
        if (pNewHead == NULL) pNewHead = pHead1;
        ListNode *pNewHead1 = pHead1->next;
        pHead1->next = pHead2;
        mergeSortedList(pNewHead1, pHead2);
    } else {
        if (pNewHead == NULL) pNewHead = pHead2;
        ListNode *pNewHead2 = pHead2->next;
        pHead2->next = pHead1;
        mergeSortedList(pHead1, pNewHead2);
    }
    return pNewHead;
}

ListNode* mergeSortList(ListNode *pHead1, ListNode *pHead2) {
    if (pHead1 == NULL)
        return pHead2;
    if (pHead2 == NULL)
        return pHead1;
    ListNode *pMergeHead = NULL;
    if (pHead1->val <= pHead2->val) {
        pMergeHead = pHead1;
        pMergeHead->next = mergeSortedList(pHead1->next, pHead2);
    } else {
        pMergeHead = pHead2;
        pMergeHead->next = mergeSortedList(pHead1, pHead2->next);
    }
    return pMergeHead;
}