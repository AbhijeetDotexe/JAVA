package com.company;
class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 20;

        while (i < 4000) {
            System.out.println("Thank You " + this.getName());
            i++;
        }
    }
}
public class Threading4 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Lakshay");
        MyThr1 t2 = new MyThr1("Priyanshu");
        MyThr1 t3 = new MyThr1("Nonu");
        MyThr1 t4 = new MyThr1("Abhijeet");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
