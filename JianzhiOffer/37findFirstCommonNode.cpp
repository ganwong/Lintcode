#include <iostream>

struct ListNode {
    int val;
    ListNode *next = NULL;
};

unsigned int getListLength(ListNode *);


ListNode* findFirstCommonNode(ListNode *pHead1, ListNode *pHead2) {
    unsigned int length1 = getListLength(pHead1);
    unsigned int length2 = getListLength(pHead2);
    int diff = length1 - length2;
    ListNode *pNode1 = pHead1;
    ListNode *pNode2 = pHead2;
    if (diff > 0) {
        while (diff) {
            pNode1 = pNode1->next;
            --diff;
        }
    }else {
        while (diff) {
            pNode2 = pNode2->next;
            --diff;
        }
    }
    while (pNode1 != NULL) {
        if (pNode1 != pNode2) {
            pNode1 = pNode1->next;
            pNode2 = pNode2->next;
        } else {
            return pNode1;
        }
    }
    return NULL;
}

unsigned int getListLength(ListNode *pHead) {
    unsigned int length = 0;
    ListNode *pNode = pHead;
    while (pNode != NULL) {
        ++length;
        pNode = pNode->next;
    }
    return length;
}