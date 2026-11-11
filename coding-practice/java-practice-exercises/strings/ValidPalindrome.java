package strings;

public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        String[] st = s.split("");
        int j = 0;
        int count = 0;
        for (int i=st.length-1; i>=0; i--) {
            System.out.println("i ="+i+" j ="+j);
            if (!st[i].equals(st[j])) {
                count++;
//                if (count>1) {
//                    return false;
//                }
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abaab"));
    }
}
