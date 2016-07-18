/**
 * Valid Palindrome
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * Example
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*/

public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        char[] arr = sb.toString().toCharArray();
        return judge(arr, 0, arr.length - 1);
    }
    public boolean judge(char[] a, int left, int right) {
        if (left > right) return true;
        return judge(a, left + 1, right - 1) && a[left] == a[right];
    }
}