#include <iostream>

struct ListNode {
    int value;
    ListNode *next = NULL;
};

ListNode* reverseList(ListNode *pHead) {
    ListNode *pNewHead = pHead;
    ListNode *pNode = pHead;
    ListNode *pPrev = NULL;

    while (pNode != NULL) {
        ListNode *pNext = pNode -> next;
        if (pNext == NULL) pNewHead = pNode;
        pNode -> next = pPrev;
        pPrev = pNode;
        pNode = pNext;
    }
    return pNewHead;

}