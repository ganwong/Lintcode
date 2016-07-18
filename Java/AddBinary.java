/**
 * Add Binary
 * 
 * Given two binary strings, return their sum (also a binary string).
 * 
 * Example
a = 11

b = 1

Return 100
 * 
*/
public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        int a1 = Integer.valueOf(a, 2);
        int a2 = Integer.valueOf(b, 2);
        int a3 = a1 + a2;
        return Integer.toBinaryString(a3);
    }
}