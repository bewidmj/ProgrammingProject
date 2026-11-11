package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseInsensitiveWordFrequencyCounter {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        List<String> list = Arrays.asList("java", "Java", "API", "database", "AWS", "aws");

        for (String item: list) {
            var key = item.toUpperCase();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
    }

}
