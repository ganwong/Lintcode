/**
 * Paint Fence
 * 
 * There is a fence with n posts, each post can be painted with one of the k colors.
You have to paint all the posts such that no more than two adjacent fence posts have the same color.
Return the total number of ways you can paint the fence

 * Example
Given n=3, k=2 return 6
*/

public class Solution {
    /**
     * @param n non-negative integer, n posts
     * @param k non-negative integer, k colors
     * @return an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        if (n <= 0 || k <= 0) return 0;
        int f1 = k, f2 = k*k, f3 = 0;
        if (n == 1) return k;
        if (n == 2) return k*k;
        while (n > 2) {
            f3 = (k - 1) * f1 + (k - 1) * f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return f3;
    }
}