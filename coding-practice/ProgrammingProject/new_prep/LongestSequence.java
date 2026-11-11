package new_prep;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(getLongestSequence(nums));
    }

    static int getLongestSequence(int[] input) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : input) {
            set.add(i);
        }

        for (int i: input) {
            if (!set.contains(i - 1)) {
                int currentLength = 1;
                while (set.contains(i + currentLength)) {
                    currentLength++;
                }
                res = Math.max(res, currentLength);
            }
        }   

        return res;
    }
    
}
