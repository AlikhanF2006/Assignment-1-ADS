import java.util.Scanner;

/**
 * Task 3: Checks if a given number n is a prime number using recursion.
 * A prime number is greater than 1 and has no divisors other than 1 and itself.
 *
 * Time complexity: O(√n), since we only check up to the square root of n recursively.
 */
public class Task3_PrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    /**
     * Recursively checks if n is divisible by any number from i to √n.
     *
     * @param n the number to check
     * @param i the current divisor
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }
}
