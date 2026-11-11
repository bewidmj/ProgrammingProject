package test;

public class NextGreaterElement {
    public static void main(String[] args) {      
        var results = getElements(new int[] {4, 5, 2, 10} );    
        for (int i: results) {
            System.out.println(i);
        }
    }

    public static int[] getElements(int[] input) {
        
        var res =  new int[input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j ++) {
                if (input[i] < input[j]) {
                    res[i] = input[j];
                    break;
                }
            }
            if (res[i] == 0) {
                res[i] = -1;
            }
        }

        return res;

    }
}
