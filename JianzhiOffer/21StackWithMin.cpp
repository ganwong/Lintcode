#include <stack>

template <typename T> class StackWithMin {
public:
    void push(T node);
    void pop();
    T min();
private:
    std::stack stack1;
    std::stack stack2;
};

template <typename T> void StackWithMin::push(T node) {
    if (stack1.empty() || node <= stack2.top())
        stack2.push(node);
    else
        stack2.push(stack2.top());

    stack1.push(node);
}

template <typename T> void StackWithMin::pop() {
    if (!stack1.empty() && !stack2.empty()) {
        stack1.pop();
        stack2.pop();
    }
}

template <typename T> T StackWithMin::min() {
    return stack2.top();
}
