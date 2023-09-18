public class ReverseString {

    /**
     * Reverse provided {@code string}.
     *
     * @param string string to be reversed
     * @return reverse string
     */
    public static String reverseString(String string) {
        final var reverseString = new StringBuilder();
        for (int charIndex = string.length() - 1; charIndex >= 0; --charIndex) {
            reverseString.append(string.charAt(charIndex));
        }
        return reverseString.toString();
    }
}

