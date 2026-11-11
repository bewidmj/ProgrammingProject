package programming;

public class PrintSubstrings2 {
    public static void main(String[] args) {
        printAllPossibleSubStrings("ABC");
    }


    //Brute force
    private static void printAllPossibleSubStrings(String input) {
        for (int i = 0; i < input.length(); i ++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
