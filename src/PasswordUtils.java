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
        for (int i = 0; i < password.length() - 1; i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

     /**
    * Checks whether a password has a character that is repeated at least three
    * times in a row.
    *
    * For example, "paaasword" has the letter 'a' three times in a row.
    *
    * @param password the password to check
    * @return true if password has a character repeated three times in a row, false otherwise
    */
    public static boolean containsTriple(String password) {
    // TODO: Make tests FIRST, then implement the method
    // Please have your tests in a separate commit from the implementation
        return false;
    }

}