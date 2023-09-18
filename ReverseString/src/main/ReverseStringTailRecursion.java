public class ReverseStringTailRecursion {

    /**
     * Reverse provided {@code string}.
     *
     * @param string string to be reversed
     * @return reverse string
     */
    public static String reverseString(String string) {
        return reverseString(string, new StringBuilder());
    }

    // This is a helper function creating tail recursion
    // This function has an accumulator argument reversedStringBuilder
    private static String reverseString(String string, StringBuilder reversedStringBuilder) {
        if (string.isEmpty()) {
            return reversedStringBuilder.toString();
        }

        reversedStringBuilder.append(string.charAt(string.length() - 1));

        return reverseString(string.substring(0, string.length() - 1), reversedStringBuilder);
    }
}

