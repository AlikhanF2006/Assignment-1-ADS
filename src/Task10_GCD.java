import java.util.Scanner;

/**
 * Task 10: Finds the greatest common divisor (GCD) using recursion.
 * Based on the Euclidean algorithm: GCD(a, b) = GCD(b, a % b)
 *
 * Time complexity: O(log(min(a, b)))
 */
public class Task10_GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);
        System.out.println(result);
    }

    /**
     * Recursive method to compute GCD using Euclidean algorithm.
     *
     * @param a first number
     * @param b second number
     * @return GCD of a and b
     */
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
