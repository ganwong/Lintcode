/**
 * Singleton
 * 
 * Example
In Java:

A a = A.getInstance();
A b = A.getInstance();
a should equal to b.
*/

class Solution {
    /**
     * @return: The same instance of this class every time
     */
    private static Solution one = null;
    public static Solution getInstance() {
        if (one == null) 
            one = new Solution();
        return one;
    }
};