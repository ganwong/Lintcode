/**
 * Length of Last Word
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Example
Given s = "Hello World", return 5.
 * 
*/
public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        int num = 0;
        boolean flag = false;
        int length = s.length();
        char[] a = s.toCharArray();
        for (int i = length - 1; i >= 0; i--) {
            if (a[i] == ' ' && flag) {
                break;
            }
            if (a[i] != ' ') {
                flag = true;
                num++;
            }
        }
        return num;
    }
}