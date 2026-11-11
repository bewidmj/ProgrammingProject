package new_prep;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        LongestUniqueSubstring lus = new LongestUniqueSubstring();

        System.out.println(lus.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int finalCount = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++ ) {

            while(set.contains(s.charAt(right)) ) {
                set.remove(s.charAt(left));
                left++;
            } 

            set.add(s.charAt(right));
            finalCount = Math.max(finalCount, right - left + 1);

        }
        return finalCount;
    }
}
