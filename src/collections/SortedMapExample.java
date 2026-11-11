package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Cherry", 3);
        map.put("Mango", 1);
        System.out.println("Original: " + map);

        //sort by keys

        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey()));

    }

}
