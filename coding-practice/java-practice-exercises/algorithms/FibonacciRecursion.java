package algorithms;

public class FibonacciRecursion {
    public static void main(String[] args) {
        fibonacci(0, 1, 10);
    }

    public static void fibonacci(int first, int second, int n) {
        if (n > 0) {
            System.out.print(first + " ");
            fibonacci(second, first + second, n - 1);
        }
    }
}
