package strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParanthesys {
    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("({[]})"));   // true
    }

    public static boolean isValid(String input) {
        if (input.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Deque<Character> deque = new ArrayDeque<>();

        for (int i= 0; i <input.length(); i++) {
            var currChar = input.charAt(i);

            if ('(' == currChar || '{' == currChar || '[' == currChar) {
                deque.push(currChar);
            } else {
                if (deque.isEmpty()) return false;

                var top = deque.pop();

                if (map.get(top) != currChar) return false;

            }

        }
        return deque.isEmpty() ? true: false;
    }
}
