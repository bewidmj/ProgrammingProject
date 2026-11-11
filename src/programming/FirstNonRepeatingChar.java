package programming;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        FirstNonRepeatingChar fnrc = new FirstNonRepeatingChar();
        String input = "swiss";
        var result = fnrc.nonRepeatingChars(input);
        System.out.println(result);

    }

    public String nonRepeatingChars(String input) { 
        String[] strArr = input.split(""); 
        Map<String, Integer> map = new LinkedHashMap<>(); 
        for (var str : strArr) { 
            map.put(str, map.getOrDefault(str, 0) + 1); 
        } 
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey(); 
    }

}