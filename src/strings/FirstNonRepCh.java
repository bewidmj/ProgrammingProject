package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepCh {


    public static void main(String[] args) {
        // Input:  "swiss"
        // Output: 'w'

        System.out.println(getFirstNonRepCharOptimized("swiss"));
    }

    public static Character getFirstNonRepChar(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Character result = null;
        for (Character item : input.toCharArray()) { 
            if (map.containsKey(item)) {
                var val = map.get(item);
                map.put(item, val + 1);
            } else {
                map.put(item, 1);
            }
        }

        var res =  map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst();
        return res.isPresent() ? res.get().getKey() : null;

    }


    public static Character getFirstNonRepCharOptimized(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Character result = null;
        for (Character item : input.toCharArray()) { 
            if (map.containsKey(item)) {
                var val = map.get(item);
                map.put(item, val + 1);
            } else {
                map.put(item, 1);
            }

            if (result != item && map.get(item) == 1){
                result = item;
            } 
        }

        return result;
    }


}
