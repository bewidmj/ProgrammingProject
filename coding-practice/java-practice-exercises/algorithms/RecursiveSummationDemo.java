package algorithms;

public class RecursiveSummationDemo {
    public static void main(String[] args) {
            System.out.println(sumSequence(5));
}
    public static long sumSequence(int n) {
    if (n == 1) return 5;
            return n + sumSequence(n-1);
    }
}
