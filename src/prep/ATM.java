
import java.util.*;

public class ATM {

    private static final int[] DENOMINATIONS = {20, 50, 100, 200, 500};

    public static void main(String[] args) {

        int[][] transactions = {
            // Deposit: 2 x 100, 1 x 500
            {-1, 0, 0, 2, 0, 1},

            // Withdraw 550 (should fail)
            {550, -1, -1, -1, -1, -1},

            // Withdraw 600 (should succeed)
            {600, -1, -1, -1, -1, -1}
        };

        List<int[]> results = processTransactions(transactions);

        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }
    }

    private static List<int[]> processTransactions(int[][] transactions) {

        List<int[]> result = new ArrayList<>(); 
        int[] deposit = new int[5];

        for (int[] line: transactions) {

            int first = line[0];

            if (first == -1) {

                for (int i = 0; i < 5; i ++) {

                    deposit[i]+= line[i + 1];

                }
            } else {

                int remaining = first;
                int[] dispensed = new int[5];

                for (int j = 4; j >= 0; j--) {

                    int notes = Math.min(deposit[j], remaining / DENOMINATIONS[j]);

                    remaining = remaining - DENOMINATIONS[j] * notes;

                    dispensed[j] = notes;

                }

                if (remaining != 0) {
                    Arrays.fill(dispensed, -1);;
                } else {

                    for (int i = 0; i < 5; i ++) {

                        deposit[i] = deposit[i] - dispensed[i];

                    }
                }

                result.add(dispensed);

            }
        }        
        return result;
    }
}
