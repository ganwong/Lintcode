#include <iostream>

struct ListNode {
    int value;
    ListNode *next = NULL;
};

ListNode* findKthToTail(ListNode *pHead, int K) {
    if (pHead == NULL || K <= 0) {
        return NULL;
    }
    ListNode *front = pHead;
    ListNode *latter = pHead;
    for (int i = 1; i < K; i++) {
        if (latter -> next != NULL)
            latter = latter -> next;
        else return NULL;
    }
    while (latter -> next != NULL) {
        latter = latter -> next;
        front = front -> next;
    }
    return front;
}

