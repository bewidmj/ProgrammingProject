package algorithms;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(oddEven(11));
    }

    private static String oddEven(int i) {
        return i % 2 == 0 ? "EVEN": "ODD";
    }
}
