/**
 * Longest Words
 * 
 * Given a dictionary, find all of the longest words in the dictionary.
 * 
 * Given

{
  "like",
  "love",
  "hate",
  "yes"
}
the longest words are ["like", "love", "hate"].
*/

class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        if (dictionary.length == 0) return null;
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0;
        for (String s : dictionary) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                list.clear();
                list.add(s);
            }
            else if (s.length() == maxLength) {
                list.add(s);
            }
        }
        
        return list;
    }
};