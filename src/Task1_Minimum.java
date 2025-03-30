import java.util.Scanner;

/**
 * Task 1: Finds the minimum value from n numbers entered by the user.
 * It reads n integers from input and returns the smallest one.
 *
 * Time complexity: O(n), where n is the number of inputs.
 * The program compares each element exactly once in a single loop.
 */
public class Task1_Minimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = scanner.nextInt();

        long startTime = System.nanoTime();

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;

        System.out.println("Minimum: " + min);
        System.out.println("Time taken: " + duration + " ms");
    }
}
