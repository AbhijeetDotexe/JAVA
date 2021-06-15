package com.company;
class practice13e extends Thread{
    public void run(){
        int i =1;
        while (i<41){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Good Morning!");
            i++;
        }
    }
}class practice13eb extends Thread{
    public void run(){
        int i =1;
        while (i<41){
            System.out.println("Good Evening!");
            i++;
        }
    }
}

public class Set10b {
    public static void main(String[] args) {
        practice13e t1 = new practice13e();
        practice13eb t2 = new practice13eb();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}
