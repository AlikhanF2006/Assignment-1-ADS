import java.util.Scanner;

/**
 * Task 8: Checks recursively whether a string contains only digits.
 * Time complexity: O(n)
 */
public class Task8_DigitsOnly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Recursive method to check if all characters in the string are digits
     *
     * @param s the input string
     * @param index current character position
     * @return true if all characters are digits, false otherwise
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
}
