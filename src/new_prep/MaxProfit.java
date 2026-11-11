package new_prep;

public class MaxProfit {

    public static void main(String[] args) {

        int[] input = new int[]{1, 5, 10, 6, 11, 6};

        System.out.println(getMaxProfit(input));
        
    }

    public static int getMaxProfit(int[] input) { 

        int min = Integer.MAX_VALUE;
        int maxDiff = 0;

        for (int i = 0; i < input.length; i++) {

            min = Math.min(min, input[i]);
            maxDiff = Math.max(maxDiff, input[i] - min);

        }

        return maxDiff;

    }
    
}
