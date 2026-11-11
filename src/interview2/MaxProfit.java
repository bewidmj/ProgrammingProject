package interview2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxProfit {

    //     Find max profit
    // Input: prices = [7,1,5,3,6,4] 
    // Output: 5


    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();

        var resp = mp.getMaxProfit(new int[] {7,1,5,3,6,4});
        System.out.println(resp);
    }

    public  int getMaxProfit(int[] input) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : input) {

            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);

        }

        return maxProfit;

    }


    
}


 class ListDemo {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int size = list.size();
        for(int index=0; index<size; index++){
            System.out.println(list.remove(index));
        }
    }
}
