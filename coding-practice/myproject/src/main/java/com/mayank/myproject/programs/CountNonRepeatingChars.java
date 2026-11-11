package com.mayank.myproject.programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNonRepeatingChars {
    public static void main(String[] args) {
        String st = "aabccvfdnnccavbnmopq";

        String[] stArray = st.split("");

        long count = Arrays.asList(stArray).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1)
                .collect(Collectors.counting());
        System.out.println(count);
    }
}
