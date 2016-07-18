/**
 * Count 1 in Binary
 * 
 * Count how many 1 in binary representation of a 32-bit integer.
 * 
 * Example
Given 32, return 1

Given 5, return 2

Given 1023, return 9
 * 
*/
public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        int cnt = 0;
        while (num != 0) {
            num &= num - 1;
            cnt++;
        }
        return cnt;
    }
};