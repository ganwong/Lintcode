/**
* Description: Fibonacci
* Example
Given 1, return 0

Given 2, return 1

Given 10, return 34
*/




class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        int f1 = 0, f2 = 1, f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}

