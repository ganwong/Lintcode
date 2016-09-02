#include <iostream>
#include <stack>

template <typename T> class CQueue {
public:
    CQueue();
    ~CQueue();

    void appendTail(const T& node);
    T deleteHead();

private:
    std::stack<T> stack1;
    std::stack<T> stack2;
};

template <typename T> void CQueue::appendTail(const T &node) {
    stack1.push(node);
}

template <typename T> T CQueue::deleteHead() {
    if (stack2.empty()) {
        while (!stack1.empty()) {
            T& tmp = stack1.top();
            stack1.pop();
            stack2.push(tmp);
        }
    }

    T head = stack2.top();
    stack2.pop();
    return head;
}
