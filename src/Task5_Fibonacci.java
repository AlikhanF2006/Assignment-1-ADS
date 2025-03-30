import java.util.Scanner;

/**
 * Task 5: Calculates the n-th Fibonacci number using recursion.
 * Fibonacci sequence: F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
 *
 * Time complexity: O(2^n) — exponential time due to repeated calls.
 * This implementation is not efficient for large n, but follows the recursion requirement.
 */
public class Task5_Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long startTime = System.nanoTime();

        int result = fibonacci(n);

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * Recursively calculates the n-th Fibonacci number.
     *
     * @param n the index of the Fibonacci number
     * @return the n-th Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
