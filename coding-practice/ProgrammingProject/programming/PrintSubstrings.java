package programming;

public class PrintSubstrings {

    public static void main(String[] args) {
        printAllSubstrings("abc");
    }

    static void printAllSubstrings(String s) {
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i + 1; j <= s.length(); j ++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

}
