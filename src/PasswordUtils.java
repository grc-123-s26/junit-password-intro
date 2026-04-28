/**
 * Utility class for analyzing passwords.
 */
public class PasswordUtils {

    /**
     * Returns a description of the password's length.
     *
     * @param password the password to analyze
     * @return "short" if the password has fewer than 6 characters,
     *         "medium" if it has between 6 and 11 characters (inclusive),
     *         or "long" if it has 12 or more characters
     */
    public static String describePasswordLength(String password) {
        int length = password.length();
        if (length < 6) {
            return "short";
        } else if (length <= 12) {
            return "medium";
        } else if (length < 40) {
            return "long";
        }
        return "very long";
    }

    /**
     * Checks whether the password contains only letters and digits.
     *
     * @param password the password to check
     * @return true if the password is alphanumeric, false otherwise
     */
    public static boolean isAlphanumeric(String password) {
        if (password.length() == 0) return false;
        for (int i = 0; i <= password.length() - 1; i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsTriple(String password) {
        char character = ' ';
        int count = 1;
        for (char c : password.toCharArray()) {
            if (c == character) {
                count += 1;
            } else {
                count = 1;
            }
            character = c;
            if (count == 3) return true;
        }
        return false;
    }

    public static int countSpecialCharacters(String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) count++;
        }
        return count;
    }

    public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
        return false;
    }

}