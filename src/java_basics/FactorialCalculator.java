package java_basics;

public class FactorialCalculator {

    /**
     * Calculates factorial using iterative approach
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param n The number to calculate factorial for (n >= 0)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates factorial using recursive approach
     * Time Complexity: O(n)
     * Space Complexity: O(n) due to call stack
     *
     * @param n The number to calculate factorial for (n >= 0)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }

    /**
     * Calculates factorial using tail recursion (optimized recursion)
     * Time Complexity: O(n)
     * Space Complexity: O(n) but can be optimized by compiler
     *
     * @param n The number to calculate factorial for (n >= 0)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long calculateFactorialTailRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        return calculateFactorialTailRecursiveHelper(n, 1);
    }

    private static long calculateFactorialTailRecursiveHelper(int n, long accumulator) {
        if (n == 0 || n == 1) {
            return accumulator;
        }
        return calculateFactorialTailRecursiveHelper(n - 1, n * accumulator);
    }

    // Main method to demonstrate factorial calculations
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length > 0) {
            try {
                int number = Integer.parseInt(args[0]);
                System.out.println("Calculating factorial for: " + number);
                System.out.println("Iterative: " + calculateFactorialIterative(number));
                System.out.println("Recursive: " + calculateFactorialRecursive(number));
                System.out.println("Tail Recursive: " + calculateFactorialTailRecursive(number));
            } catch (NumberFormatException e) {
                System.out.println("Error: Please provide a valid integer as command line argument.");
                System.out.println("Usage: java FactorialCalculator <number>");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            // Default demonstration
            System.out.println("=== Factorial Calculator Demonstration ===\n");

            int[] testNumbers = {0, 1, 5, 10};

            for (int number : testNumbers) {
                System.out.println("Factorial of " + number + ":");
                System.out.println("  Iterative: " + calculateFactorialIterative(number));
                System.out.println("  Recursive: " + calculateFactorialRecursive(number));
                System.out.println("  Tail Recursive: " + calculateFactorialTailRecursive(number));
                System.out.println();
            }

            // Demonstrate error handling
            System.out.println("Testing error handling:");
            try {
                calculateFactorialIterative(-1);
            } catch (IllegalArgumentException e) {
                System.out.println("  Negative input error: " + e.getMessage());
            }

            System.out.println("\nUsage: java FactorialCalculator <number>");
            System.out.println("Example: java FactorialCalculator 7");
        }
    }
}