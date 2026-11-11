package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToFront {
    

//     i/p int arr[] = {23,99,0,45,0,12,0,67};
// o/p int arr[] = {0,0,0,23,99,45,12,67


public static void main(String[] args) {
int arr[] = {23,99,0,45,0,12,0,67};

    var resp = getResponse(arr);

    resp.stream().forEach(System.out::println);
}

public static List<Integer> getResponse(int[] input) {

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i <input.length; i ++) {
        if (input[i] == 0) {
            list.add(input[i]);
        }
    }

    for (int i: input) {
        if (i != 0) {
            list.add(i);
        }
    }

    return  list;
}


}
