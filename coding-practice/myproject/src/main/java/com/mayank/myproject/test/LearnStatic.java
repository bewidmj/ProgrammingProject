package com.mayank.myproject.test;

public class LearnStatic {
    public static void main(String[] args) {
        B b = new B();
        b.sA();
    }

}
class A {
    public static void sA() {
        System.out.println("A Inside SA");
        sB();
    }

    static void sB() {
        System.out.println("A Inside SB");
        sC();
    }

    static void sC() {
        System.out.println("A Inside SC");
    }
}

class B extends A {
    public static void sA() {
        System.out.println("B Inside SA");
        sB();
    }
    static void sC() {
        System.out.println("B Inside SB");
    }
}
