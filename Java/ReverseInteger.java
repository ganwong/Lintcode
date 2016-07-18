/**
 * Reverse Integer
 * 
 * Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).
 * 
 * Example
Given x = 123, return 321

Given x = -123, return -321
 * 
*/

public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        long tmp = 0;
        while (n != 0) {
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) tmp;
    }
}