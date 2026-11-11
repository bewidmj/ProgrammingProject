package prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

    public static void main(String[] args) {
        
        int[] arr = new int[] {2, 7 , 11, 15, 6, 3};
        int targetValue = 9;

        var res = getTragetIndices(arr, targetValue);

        for (Entry<Integer, Integer> i : res.entrySet()) {
            System.out.println(i.getKey() +" , "+ i.getValue());
        }

    }

    private static Map<Integer, Integer> getTragetIndices(int[] input, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer>  resp = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            var compliment = target - input[i];
            
            if (map.containsKey(compliment)) {
                resp.put(map.get(compliment), i);
            }

            map.put(input[i], i);

        }

        return resp;

    }
    
}
