import java.util.Scanner;

/**
 * Task 2: Calculates the average of n numbers entered by the user.
 * It reads n integers from input, calculates their sum, and outputs the average.
 *
 * Time complexity: O(n), where n is the number of inputs.
 * We iterate through all n numbers once to compute the sum.
 */
public class Task2_Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        double average = (double) sum / n;

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println(average);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
