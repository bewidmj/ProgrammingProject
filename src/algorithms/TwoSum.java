package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        var res = getTwoSumIndices(nums, 9);
        for (int r : res) {
            System.out.println(r);
        }

    }

    public static int[] getTwoSumIndices(int[] input, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : input) {
            int complement = target - i;
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), index};
            } else {
                map.put(i, index);
            }
            index++;
        }
        return null;
    }
}
