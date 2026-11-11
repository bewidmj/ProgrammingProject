package programming;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(getMaxDiffOptimized(arr)); // 9
        System.out.println(getMaxDiffOptimizedOrdered(arr)); // 8
    }

    static int getMaxDiff(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(maxDiff < arr[i] - arr[j]) {
                    maxDiff = arr[i] - arr[j];
                }
            }
        }
        return maxDiff;
    }

    static int getMaxDiffOrdered(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(maxDiff < arr[j] - arr[i]) {
                    maxDiff = arr[j] - arr[i];
                }
            }
        }
        return maxDiff;
    }

    static int getMaxDiffOptimized(int[] arr) {
        if (null == arr || arr.length < 2) return 0;
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }
        return maxVal - minVal;
    }

    static int getMaxDiffOptimizedOrdered(int[] arr) {
        if (null == arr || arr.length < 2) return 0;
        int maxDiff = Integer.MIN_VALUE;
        int minVal = arr[0];
            for (int i = 1; i < arr.length; i++) {
                minVal = Math.min(minVal, arr[i]);
                maxDiff = Math.max(maxDiff, arr[i] - minVal);
            }
        return maxDiff;
    }
}
