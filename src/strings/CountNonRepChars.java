package strings;

import java.util.HashMap;
import java.util.Map;

public class CountNonRepChars {
    public static void main(String[] args) {
        System.out.println(countNonRepChars("aabbcefgghh"));
    }

    //Brute force
    private static int countNonRepChars(String input) {
        if (input == null || input.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            var key = input.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return (int) map.entrySet().stream().filter(entry -> entry.getValue() == 1).count();
    }
}
