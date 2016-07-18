/**
 * Happy Number
 * 
 * Write an algorithm to determine if a number is happy.

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 * Example
19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

*/

public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int[] digits = getDigits(n);
        int m = getMulti(digits);
        while (!set.contains(m)) {
            set.add(m);
            if (m == 1) {
                return true;
            }
            m = getMulti(getDigits(m));
        }
        return false;
    }
    
    public int getMulti(int[] a) {
        int multi = 0;
        for (int i = 0; i < a.length; i++) {
            multi += a[i] * a[i];
        }
        return multi;
    }
    public int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] a = new int[s.length()];
        int i = 0;
        while (n > 0) {
            a[i++] = n % 10;
            n = n / 10;
        }
        return a;
    }
}