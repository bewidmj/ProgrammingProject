package interview2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParan {

    public static void main(String[] args) {

        System.out.println(isValidParanthesis("{([])}"));
        System.out.println(isValidParanthesis("([)]"));
        
    }
    
    static boolean isValidParanthesis(String input) {

        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : input.toCharArray()) {

            if (isOpening(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && map.get(c) ==stack.peek()) {
                stack.pop();
            } else {
                return false;
            }
            
        }

        return stack.isEmpty();

    }

    static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
