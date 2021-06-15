package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=20;
        while(i<4000){
            System.out.println("I am a Thread");
            i++;
        }
    }

}
public class Threading3 {
    public static void main(String[] args) {
        MyThr m = new MyThr("lakshay");
        m.start();
        System.out.println("The Id of the thread is "+ m.getId());
        System.out.println("The Id of the thread is "+ m.getName());
    }
}
