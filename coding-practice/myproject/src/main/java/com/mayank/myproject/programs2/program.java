package com.mayank.myproject.programs2;

public class program {
    public static void main(String[] args) {
            System.out.println(call(5));
}
    public static long call(int n) {
    if (n == 1) return 5;
            return n + call(n-1);
    }
}
