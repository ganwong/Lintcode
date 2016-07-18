/**
 * Left Pad
 * Example
leftpad("foo", 5)
>> "  foo"

leftpad("foobar", 6)
>> "foobar"

leftpad("1", 2, "0")
>> "01"

*/

public class StringUtils {
    /**
     * @param originalStr the string we want to append to with spaces
     * @param size the target length of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size) {
        if (originalStr.length() >= size) return originalStr;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size-originalStr.length(); i++) {
            sb.append(' ');
        }
        sb.append(originalStr);
        return sb.toString();
    }

    /**
     * @param originalStr the string we want to append to
     * @param size the target length of the string
     * @param padChar the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        if (originalStr.length() >= size) return originalStr;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size-originalStr.length(); i++) {
            sb.append(padChar);
        }
        sb.append(originalStr);
        return sb.toString();
    }
}