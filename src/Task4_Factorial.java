import java.util.Scanner;

/**
 * Task 4: Calculates the factorial of a number using recursion.
 * The factorial of n (written as n!) is the product of all positive integers ≤ n.
 *
 * Time complexity: O(n), where n is the input number.
 * We perform one recursive call per number down to 1.
 */
public class Task4_Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }
    /**
     * Recursive method to calculate factorial of a number.
     *
     * @param n the number to calculate factorial of
     * @return n!
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
