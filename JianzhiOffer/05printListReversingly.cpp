//从尾到头打印链表

#include <iostream>
#include <stack>

struct ListNode {
    int value;
    ListNode *next;
};

void addToTail(ListNode** pHead, int value) {
    ListNode *pNew = new ListNode();
    pNew -> value = value;
    pNew -> next = NULL;

    if (*pHead == NULL) {
        *pHead = pNew;
    }
    else {
        ListNode *pNode = *pHead;
        while (pNode -> next != NULL) {
            pNode = pNode -> next;
        }
        pNode -> next = pNew;
    }
}

void removeNode(ListNode** pHead, int value) {
    if (pHead == NULL || *pHead == NULL) {
        return;
    }

    ListNode *pNeedDeleted = NULL;

    if ((*pHead) -> value == value) {
        pNeedDeleted = *pHead;
        *pHead = (*pHead) -> next;
        return;
    }
    ListNode *pPrev = *pHead;
    ListNode *pCurr = pPrev -> next;
    while (pCurr -> next != NULL) {
        if (pCurr -> value != value) {
            pPrev = pPrev -> next;
            pCurr = pPrev -> next;
        }
        else {
            pNeedDeleted = *pHead;
            pPrev -> next = pCurr -> next;
        }
    }
    if (pNeedDeleted != NULL) {
        delete pNeedDeleted;
    }
}

void printListReversingly_Iteratively(ListNode *pHead) {
    std::stack<ListNode *> nodes;
    ListNode *pNode = pHead;
    while (pNode != NULL) {
        nodes.push(pNode);
        pNode = pNode -> next;
    }
    while (!nodes.empty()) {
        pNode = nodes.top();
        std::cout << pNode -> value << " ";
        nodes.pop();
    }
}

void printListReversingly_Recursively(ListNode *pHead) {
    if (pHead == NULL) {
        return;
    }
    printListReversingly_Recursively(pHead -> next);
    std::cout << pHead -> value << " ";
}