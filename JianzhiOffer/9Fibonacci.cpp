#include <iostream>

int fibonacci(int n);

int main() {
    int n;
    std::cout << "enter number: " << std::endl;
    std::cin >> n;
    for (int i = 1; i <= n; i++) {
        std::cout << std::to_string(fibonacci(i)) << " ";
    }
}
int fibonacci(int n) {
    int f1 = 0, f2 = 1, f3 = 1;
    if (n == 1) return f1;
    if (n == 2) return f2;
    for (int i = 3; i <= n; i++) {
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
    }
    return f3;
}