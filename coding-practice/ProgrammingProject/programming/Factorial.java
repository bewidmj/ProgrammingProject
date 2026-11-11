package programming;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(printFactorials(10));
        System.out.println(factorialRecursion(10));
    }

    private static int printFactorials(int input) {
        var rs = 1;
        if (input == 0) {
            return 1;
        }

        for (int i = 1; i <= input; i++) {
            rs = i * rs;
        }
        return rs;
    }

    public static int factorialRecursion(int input) {
        if (input == 1) {
            return 1;
        }
        return input * factorialRecursion(input - 1);
    }
}
