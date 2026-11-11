package new_prep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class ValidParanthesis {

    static Map<Character, Character> validPairs = Map.of(']', '[', '}', '{', ')', '(');

    public static void main(String[] args) {
//          "{[()]}"  → true
//          "{[(])}"  → false
//          "((()))"  → true
//          "([)]"    → false

        var res = isValid("{[(])}");
        System.out.println(res);
    }
    
    static boolean isValid(String input) {
        
        Deque<Character> stack = new ArrayDeque<>();

        for (Character item: input.toCharArray()) {

            if (isOpening(item)) {
                stack.push(item);
            } else if (!stack.isEmpty() && validPairs.get(item) == stack.peek()) {
                        stack.pop();
                }
                else {
                    return false;
                }
            }

        return stack.isEmpty();

    }

    static boolean isOpening(Character item) {
        return item == '[' || item == '{' || item == '(';
    }

    static boolean isClosing(Character item) {
        return item == ']' || item == '}' || item == ')' ;
    }
}
