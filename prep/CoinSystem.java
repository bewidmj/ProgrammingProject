import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CoinSystem {
    
    //inputs
    // productCost = 150
    // imsertedCoins = 100, 100
    // coinSystem - [1,2,5,10,20,50,100,200]
    // 
    // 

    public static void main(String[] args) {

        int[] coinSystem = {1, 2, 5, 10, 20, 50, 100, 200};

        // Test Case 1: Exact payment
        System.out.println("Test Case 1: Exact Payment");
        testChange(150, new int[]{100, 50}, coinSystem);

        // Test Case 2: Insufficient payment
        System.out.println("\nTest Case 2: Insufficient Payment");
        testChange(150, new int[]{100}, coinSystem);

        // Test Case 3: Multiple denominations
        System.out.println("\nTest Case 3: Change = 450");
        testChange(150, new int[]{500, 100}, coinSystem);

        // Test Case 4: Multiple same denominations
        System.out.println("\nTest Case 4: Change = 350");
        testChange(150, new int[]{200, 200, 100}, coinSystem);
    }

    private static void testChange(int productCost, int[] insertedCoins, int[] coinSystem) {

        Map<Integer, Integer> result = getChange(productCost, insertedCoins, coinSystem);

        if (result == null) {
            System.out.println("Insufficient payment or no change required.");
            return;
        }

        if (result.isEmpty()) {
            System.out.println("No change required.");
            return;
        }

        result.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }

    //Actual Code Impl
    public static Map<Integer, Integer> getChange(int productCost, int[] insertedCoins, int[] coinSystem) {
        Map<Integer, Integer> result = new HashMap<>();
        
        int amount = 0;
        for (int coin : insertedCoins) {
            amount = amount + coin;
        }

        int target = amount - productCost;

        var sortedCoinSystem = IntStream.of(coinSystem).boxed().sorted((c1, c2) -> c2 - c1).mapToInt(Integer::intValue).toArray();

        if (target > 0) {

            for (int c: sortedCoinSystem) {

                int count = target / c;

                if (count > 0) {

                    result.put(c, count);
                    target = target - (count * c);

                }
            }

        } else if (target == 0) {
            return new HashMap<>();
        } else {
            return null;
        }

        return  result;
        
    }



}
