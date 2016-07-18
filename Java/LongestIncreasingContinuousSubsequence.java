/**
 * Longest Increasing Continuous Subsequence
 * 
 * Give an integer array，find the longest increasing continuous subsequence in this array.

An increasing continuous subsequence:

Can be from right to left or from left to right.
Indices of the integers in the subsequence should be continuous.

Example
For [5, 4, 2, 1, 3], the LICS is [5, 4, 2, 1], return 4.

For [5, 1, 2, 3, 4], the LICS is [1, 2, 3, 4], return 4.
 * 
*/

public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A == null || A.length == 0) return 0;
        int currLength = 1, currLength2 = 1;
        int maxL = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                currLength++;
                if (currLength > maxL) maxL = currLength;
            }else {
                currLength = 1;
            }
            
        }
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                currLength2++;
                if (currLength2 > maxL) maxL = currLength2;
            }else {
                currLength2 = 1;
            }
            
        }
        return maxL;
    }
}