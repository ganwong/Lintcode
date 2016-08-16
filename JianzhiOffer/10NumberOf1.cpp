#include <iostream>

int numberOf1_s1(int n);
int numberOf1_s2(int n);

int main() {
    std::cout << "enter number: " << std::endl;
    int input;
    std::cin >> input;
    std::cout << numberOf1_s1(input) << " " << numberOf1_s2(input) << std::endl;

}
int numberOf1_s1(int n) {
    int cnt = 0;
    int m = 1;
    while (m) {
        if (n & m) {
            cnt++;
        }
        m = m << 1;
    }
    return cnt;
}
int numberOf1_s2(int n) {
    int cnt = 0;
    while (n) {
        n &= n - 1;
        cnt++;
    }
    return cnt;
}