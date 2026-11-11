//package com.mayank.myproject.programs1;
//
//public class ThreadsProgram implements  Runnable {
//
//    private String threadName;
//
//    ThreadsProgram (String threadName) {
//        this.threadName = threadName;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <=10; i++) {
//            if (this.threadName.equals("T1") && i % 2 == 0) {
//                try {
//                    System.out.println(i + " "+ Thread.currentThread());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (this.threadName.equals("T2") && i % 2 != 0) {
//                    System.out.println(i + " "+ Thread.currentThread());
//            }
//        }
//
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(new ThreadsProgram("T1"));
//        Thread t2 = new Thread(new ThreadsProgram("T2"));
//        t1.start();
//        t2.start();
//    }
//}
