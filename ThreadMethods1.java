package com.company;
class MyThr2 extends Thread {
    public void run() {
        //int i = 20;

        while (true) {
            System.out.println("Thank You " );
            //i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThr3 extends Thread {
    public void run() {
        int i = 20;

        while (i < 4000) {
            System.out.println(" Welcome " );
            i++;
        }
    }
}


public class ThreadMethods1 {
    public static void main(String[] args) {
            MyThr2 t1 = new MyThr2();
            MyThr2 t2 = new MyThr2();
            t1.start();
//            try{
//                t1.join();
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            t2.start();
            MyThr3 t3 = new MyThr3();
            t3.start();
    }
}
