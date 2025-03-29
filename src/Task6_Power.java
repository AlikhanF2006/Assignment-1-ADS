import java.util.Scanner;

/**
 * Task 6: Calculates a raised to the power of n using recursion.
 * Time complexity: O(n)
 */
public class Task6_Power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int result = power(a, n);
        System.out.println(result);
    }

    /**
     * Recursive function to calculate a^n
     *
     * @param a the base
     * @param n the exponent
     * @return a raised to the power n
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
