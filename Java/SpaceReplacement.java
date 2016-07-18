/**
 * Space Replacement
 * 
 * Write a method to replace all spaces in a string with %20. The string is given in a characters array, you can assume it has enough space for replacement and you are given the true length of the string.

You code should also return the new length of the string after replacement.
 * 
 * Example
Given "Mr John Smith", length = 13.

The string after replacement should be "Mr%20John%20Smith", you need to change the string in-place and return the new length 17.
 * 
*/

public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        for (int i = 0; i < length; i++) {
            if (string[i] != ' ') continue;
            length += 2;
            for (int j = length-1; j >= i+3; j--) {
                string[j] = string[j-2];
            }
            string[i] = '%';
            string[i+1] = '2';
            string[i+2] = '0';
        }
        return length;
    }
}