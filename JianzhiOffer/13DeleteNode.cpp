#include <iostream>

struct ListNode {
    int value;
    ListNode *next;
};

void deleteNodeInList(ListNode** pHead, ListNode* pNeedDeleted) {
    if (pHead == NULL || pNeedDeleted == NULL) {
        return;
    }

    if (pNeedDeleted -> next != NULL) {
        int tmp = pNeedDeleted -> value;
        pNeedDeleted -> value = pNeedDeleted -> next -> value;
        pNeedDeleted -> next -> value = tmp;
        pNeedDeleted -> next = pNeedDeleted -> next -> next;
        return;
    }
    if (pNeedDeleted -> next == NULL) {
        if (*pHead == pNeedDeleted) {
            *pHead == NULL;
            return;
        }
        ListNode *pNode = *pHead;
        while (pNode -> next != pNeedDeleted) {
            pNode = pNode -> next;
        }
        pNode -> next = pNode -> next -> next;
        return;
    }
    delete pNeedDeleted;
    pNeedDeleted = NULL;
}