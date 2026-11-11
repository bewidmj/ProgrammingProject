package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueSortingAndStringSlicingDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                //.collect(Collectors.toMap());
        .forEach(entry -> {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        });


        String s1 ="String";
        String s2 ="ingStr";

        String temp = s1;

        while (temp.length() > 1) {
            temp = temp.substring(temp.length() / 2, temp.length() -1);
        }


    }

}
