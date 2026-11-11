package programming;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        
    }

    public static int findLongestSubString(String input) {

        int left = 0;
        int maxLength = 0;

    
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < input.length(); right ++) {
            var character = input.charAt((right));
            if (map.containsKey(character)) {
                left = Math.max(left, map.get(character));
            }
            map.put(character, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
    
}
