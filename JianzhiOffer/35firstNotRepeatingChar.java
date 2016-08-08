public static char firstNotRepeatingChar(String s) {
        if (s == null || s.length() == 0) return '\0';
        char arr[] = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (char c : arr) {
            if (m.containsKey(c))
                m.put(c, m.get(c) + 1);
            else m.put(c, 1);
        }
        for (char c : arr) {
            if (m.get(c) == 1) {
                return c;
            }
        }
        return '\0';
}