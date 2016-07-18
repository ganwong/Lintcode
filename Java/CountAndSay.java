/**
 * Count and Say
 * 
 * The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.

11 is read off as "two 1s" or 21.

21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth sequence.

Example
Given n = 5, return "111221".
*/

public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        if (n < 1) return null;
        String fn = "1";
        for (int i = 1; i < n; i++) {
            fn = getNext(fn);
        }
        return fn;
    }
    public String getNext(String s) {
        char[] a = s.toCharArray();
        int num = 0;
        char curr = a[0];
        StringBuilder sb = new StringBuilder();
        for (char c : a) {
            if (c != curr) {
                sb.append(String.valueOf(num) + curr);
                curr = c;
                num = 1;
            }else {
                num++;
            }
        }
        sb.append(String.valueOf(num) + curr);
        return sb.toString();
    }
}