package strings;

import java.util.HashMap;
import java.util.Map;

//ABCBCABCDEF

public class LongestSubstribngWithoutRep {
    public static void main(String[] args) {
        String input = "ABCBCABCDEF";
        var result = getLongestSubstring(input);
        System.out.println(result);
    }

    public static int getLongestSubstring(String input) {
        int maxLength = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < input.length(); right ++) {

            var currChar = input.charAt(right);
            if (map.containsKey(currChar) && left <= map.get(currChar)) {
                left = map.get(currChar) + 1;
            }

            map.put(input.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}
