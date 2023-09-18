public class ReverseStringRecursion {

    /**
     * Reverse provided {@code string}.
     *
     * @param str string to be reversed
     * @return reverse string
     */
    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
