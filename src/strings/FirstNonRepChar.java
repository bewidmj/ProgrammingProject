package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepChar {
    public static void main(String[] args) {
        var res = getFirstCharacter("swiss");
        System.out.println(res);

        Long.

    }

    public static Character getFirstCharacter(String input) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i<input.length(); i ++) {
            var currChar = input.charAt(i);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }

        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();

    }
}
