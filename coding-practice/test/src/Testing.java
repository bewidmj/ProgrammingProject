public class Testing {

    List<String> list = "java", "Java", "API", "database", "AWS", "aws"

     

    for (String item: list) {

        var key = item.toUpperCase();
        if (map.containsKey(key)) {
            map.put(key, map.get(key) + 1)
        } else {
            map.put(key, 1);
        }

    }
    
}
