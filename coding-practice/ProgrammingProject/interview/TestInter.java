// package interview;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedHashMap;
// import java.util.List;
// import java.util.function.Function;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;

// // i/p
// // [2,1,2,3,1,4,5,1,6,5]
// // o/p 
// // 2 -> 2 times
// // 1 -> 3 times
// // 3 -> 1 time
// // 4 -> 1 time
// // 5 -> 2 times
// // 6 -> 1 time

// public class TestInter {

//     public static void main(String[] args) {


//         FunctionalInterfaceType res = () -> {
//             supply() {
//                 System.out.println("Function");
//             }
//         };
        
//         //int[] input = new int[] {2,1,2,3,1,4,5,1,6,5};
//         List<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(1);
//         list.add(4);
//         list.add(5);
//         list.add(1);
//         list.add(6);
//         list.add(5);

//         printFrequency(list);
        
//     }

//     public static void printFrequency(List<Integer> input) {

//         //var in = Arrays.asList(input);
//         System.out.println("entering");
//         var result = input.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

//         result.entrySet().stream().forEach(enrty -> 
//             System.out.println("key: "+enrty.getKey() + " value: "+ enrty.getValue())
//         );

//     }



// }



// Strategy ->

//     updateConfigs();
//     prepareExtract();

// USCONStrategy -> Strategy
    
// EMEAStrategy -> Strategy

// Employee -> {
//     EmployeeBuilder.name().age().build();

// }

// EmployeeBuilder -> build -> provide var args

//     static EmployeeBuilder(name, age, ..) {

//     }

// }
