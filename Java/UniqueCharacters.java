public class Solution {
    /**
     * Unique Characters
     * 
     * Implement an algorithm to determine if a string has all unique characters.
     * 
     * Example
Given "abc", return true.

Given "aab", return false.
     * 
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        if (str == null) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            else {
                set.add(str.charAt(i));
            }
        }
        return true;
    }
}