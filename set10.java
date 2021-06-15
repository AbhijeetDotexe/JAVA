package com.company;
class practice13 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning!");
        }
    }
}class practice13b extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Evening!");
        }
    }
}
public class set10 {
    public static void main(String[] args) {
        practice13 p = new practice13();
        practice13b q = new practice13b();
        p.start();
        q.start();
    }
}
