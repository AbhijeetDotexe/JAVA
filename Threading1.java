package com.company;
class MyThread1 extends Thread{
    @Override
        public void run() {
        int i = 0;
        while (i<40000) {
            System.out.println("My Thread1 is running I am very Happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int j = 0;
        while (j<40000) {
            System.out.println("My Thread2 is running I am Sad!");
                j++;
        }
    }
}

public class Threading1 {
    public static void main(String[] args) {
        MyThread1 m = new MyThread1();
        MyThread2 n = new MyThread2();
        m.start();
        n.start();

    }
}
