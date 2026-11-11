package programming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MatchTarget {

    // Input: nums = [2, 7, 11, 15], target = 9  
    // Output: [0, 1]

    public static void main(String[] args) {
        MatchTarget fnrc = new MatchTarget();
        int[] input = {2, 13, 11, 15, 7};
        int target = 9;
        var result = fnrc.matchTarget(input, target);
        System.out.println(result[0] +", "+ result[1]);

    }

    public int[] matchTarget(int[] input, int target) { 
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i ++) {
            var complement = target - input[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(input[i], i);
        }
        return new int[]{-1, -1};

    }
}