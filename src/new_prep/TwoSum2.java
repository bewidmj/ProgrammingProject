package new_prep;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    
public static void main(String[] args) {

    int[] input = new int[] {2,5,7,10,5,8};

    int[] res = getTwoSum(input, 9);

    for (int i: res) {
        System.out.println(i);
    }
    
}

public static int[] getTwoSum(int[] input, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < input.length; i ++) {

        var required = target - input[i];

        if (map.containsKey(required)) {
            return new int[] {(map.get(required)), i};
        }

        map.put(input[i], i);

    }

    return new int[0];
}
 
}
