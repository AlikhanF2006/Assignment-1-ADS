import java.util.Scanner;

/**
 * Task 7: Reads n numbers and prints them in reverse order using recursion.
 * Arrays or lists are not used — only recursion and console input.
 *
 * Time complexity: O(n)
 */
public class Task7_Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverse(scanner, n);
    }

    /**
     * Recursively reads and prints elements in reverse order.
     *
     * @param scanner Scanner for reading input
     * @param n number of elements to read
     */
    public static void reverse(Scanner scanner, int n) {
        if (n == 0) return;

        int x = scanner.nextInt();
        reverse(scanner, n - 1);
        System.out.print(x + " ");
    }
}
