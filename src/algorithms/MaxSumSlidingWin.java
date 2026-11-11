package algorithms;

import java.util.HashMap;
import java.util.Map;

public class MaxSumSlidingWin {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(getMaxSum(nums, 3));
    }

    static int getMaxSum(int[] input, int k) {
        int maxSum = 0;
        int sum = 0;

        for (int kItem = 0; kItem < k; kItem++) {
            sum = input[kItem] + sum;
        }


        maxSum = sum;

        for (int i = 1; i < input.length; i ++) {
            if (i + k <= input.length) {
                sum = (sum - input[i - 1]) + input[i + k - 1] ;
                maxSum = Math.max(maxSum, sum);
            } else {
                break;
            }
        }
        return maxSum;
    }
}
