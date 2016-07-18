/**
 *  Permutation Index
 * 
 * Given a permutation which contains no repeated number, find its index in all the permutations of these numbers, which are ordered in lexicographical order. The index begins at 1.
 * 
 * Example
Given [1,2,4], return 1.
 * 
*/
public class Solution {
    /**
     * @param A an integer array
     * @return a long integer
     */
     public long permutationIndex(int[] A) {
        if (A == null) return 0;
        long whole = 1;
        for (int i = 0; i < A.length; i++) {
            int cnt = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] < A[i]) cnt++;
            }
            whole += cnt * getFactorial(A.length - 1 - i);
        }
        return whole;
    }

    public long getFactorial(int i) {
        long multi = 1;
        while (i != 0) {
            multi *= i;
            i--;
        }
        return multi;
    }

}