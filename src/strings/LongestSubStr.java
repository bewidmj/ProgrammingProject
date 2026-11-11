package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStr {

    public static void main(String[] args) {

        String input = "abcbcabcbb";

        var res = getLongestSubString(input);

        System.out.println(res);
        
    }

    public static int getLongestSubString(String input) { 

        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < input.length(); right++) {

            while (set.contains(input.charAt(right))) {
                set.remove(input.charAt(left));
                left++;
            }

            
            set.add(input.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;

    }
    
}
