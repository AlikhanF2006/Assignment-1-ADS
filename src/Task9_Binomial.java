import java.util.Scanner;

/**
 * Task 9: Calculates the binomial coefficient C(n, k) using recursion.
 * Formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
 * Base cases: C(n, 0) = C(n, n) = 1
 *
 * Time complexity: O(2^n)
 */
public class Task9_Binomial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binomial(n, k);
        System.out.println(result);
    }

    /**
     * Recursive method to calculate binomial coefficient C(n, k)
     *
     * @param n total items
     * @param k selected items
     * @return C(n, k)
     */
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
