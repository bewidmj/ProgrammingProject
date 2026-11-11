package java_basics;

public class factRecursive {
    public static void main(String[] args) {
        var output = factorial(5);
        System.out.println(output);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
