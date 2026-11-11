package test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubPractice2 {
    
    public static void main(String[] args) {
        String input = "ABCBCABCDEF";
        var result = getLongestSubstring(input);
        System.out.println(result);

        var res = getLongestActualSubstring(input);
        System.out.println(res);

    }

    public static int getLongestSubstring(String input) {
        Map<Character, Integer> map  = new HashMap<>();

        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < input.length(); right ++) {

            var currChar = input.charAt(right);

            if (map.containsKey(currChar)) {
                left = Math.max(left, map.get(currChar) + 1);
            }

            maxLength = Math.max(maxLength, right - left + 1);
            map.put(currChar, right);
        }

        return maxLength;
    }

    public static String getLongestActualSubstring(String input) {
        Map<Character, Integer> map  = new HashMap<>();

        int left = 0;
        String result = "";
        for (int right = 0; right < input.length(); right ++) {

            var currChar = input.charAt(right);

            if (map.containsKey(currChar)) {
                left = Math.max(left, map.get(currChar) + 1);
            }

            if (result.length() < right - left + 1) {
                result = input.substring(left, right + 1);
            }
            map.put(currChar, right);
        }

        return result;
    }
}