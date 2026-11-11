package programming;

public class MaxDiff2 {
    public static void main(String[] args) {
        System.out.println(getMaxDiffOrderedOpt(new int[] {10,4,12,6,7,4,1,7,8,9}));
    }

    //Brute Force
    private static int getMaxDiff(int[] input) {
        if (input == null || input.length < 2) return 0;
        int max = input[1] - input[0];
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                max = Math.max(max, input[j] - input[i]);
            }
        }
        return max;
    }

    //Optimized
    private static int getMaxDiffOpt(int[] input) {
        if (input == null || input.length < 2) return 0;
        int max = 0;
        int min = 0;
        for (int i = 1; i < input.length; i++) {
            max = Math.max(max, input[i]);
            min = Math.min(min, input[i]);
        }
        return max - min;
    }

    // If order matters

    //Brute Force
    private static int getMaxDiffOrdered(int[] input) {
        if (input == null || input.length < 2) return 0;
        int max = input[1] - input[0];
        for (int i = 1; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                max = Math.max(max, input[j] - input[i]);
            }
        }
        return max;
    }

    private static int getMaxDiffOrderedOpt(int[] input) {
        if (input == null || input.length < 2) return 0;
        int maxDiff = Integer.MIN_VALUE;
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            min = Math.min(min, input[i]);
            maxDiff = Math.max(maxDiff, input[i] - min);
        }
        return maxDiff;
    }
}
