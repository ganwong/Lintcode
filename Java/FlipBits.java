/**
 * Flip Bits
 * 
 * Determine the number of bits required to flip if you want to convert integer n to integer m.
 * 
 * Example
Given n = 31 (11111), m = 14 (01110), return 2.
 * 
*/
class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        int r = a ^ b;
        int cnt = 0;
        while (r != 0) {
            r &= r - 1;
            cnt++;
        }
        return cnt;
    }
};
