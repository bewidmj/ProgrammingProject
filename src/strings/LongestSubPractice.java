package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubPractice {
    
    public static void main(String[] args) {
        String input = "ABCBCABCDEF";
        var result = getLongestSubstring(input);
        System.out.println(result);

        var res = getFirstNonRepSubstring(input);
        System.out.println(res);

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

            map.put(currChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static int getFirstNonRepSubstring(String input) {
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < input.length(); right ++) {

            var currChar = input.charAt(right);

            if (map.containsKey(currChar)) {
                return maxLength;
            }

            map.put(currChar, right);
            maxLength = Math.max(maxLength, right + 1);
        }
        return maxLength;
    }
}
